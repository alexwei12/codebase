package chart;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;

/**
 * @author weihongyi5
 */
public class BarChartAWT extends ApplicationFrame {

    public BarChartAWT(String title) {
        super(title);
        JFreeChart barChart = ChartFactory.createHistogram(
            title,
            "number",
            "value",
            createDataset(),
            PlotOrientation.VERTICAL,
            true, true, false);

        ChartPanel chartPanel = new ChartPanel( barChart );
        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
    }

    private HistogramDataset createDataset( ) {
        final HistogramDataset  dataset =
            new HistogramDataset( );

        int count = 1 * 10 * 1000;
        int total = 30 * 1000;
//        double[] values = getRandomDoubles(count, 20, 500);
//        double[] values = getGaussDoublesFixed(count, 100, 10, 500);
        double[] values = getByProbability(count, new int[]{10,15,15,200},  new int[]{98,0,2});
//        double[] values = getByProbability(count, new int[]{20, 25, 25,  500},  new int[]{99, 0, 1});

        dataset.addSeries("Histogram",values, count);

        System.out.println(average(values));

        return dataset;
    }

    public static double average(double table[]) {

        double sum=0.0;

        for (int i=0;i<table.length;i++) {
            sum += table[i];
        }
        return sum / table.length;

    }

    private double[] getRandomDoubles(int count, int min, int max) {
        double[] values = new double[count];
        ThreadLocalRandom generator = ThreadLocalRandom.current();
        for (int i=0; i < count; i++) {
            values[i] = generator.nextInt(min, max);
        }
        return values;
    }

    private double[] getGaussDoubles(int count) {
        double[] values = new double[count];
        Random generator = new Random();
        for (int i=0; i < count; i++) {
            values[i] = generator.nextGaussian();
        }
        return values;
    }

    private double[] getGaussDoublesFixed(int count, int avg,  int min, int max) {
        double[] values = new double[count];
        Random generator = ThreadLocalRandom.current();

        int deviation = (max - avg) / 3;
        for (int i=0; i < count; i++) {
            double value = -1;
            do {
                value = generator.nextGaussian();
                value *= deviation;
                value += avg;
                value = (int) value;
            } while (value <= min || value >= max);
            values[i] = value;
        }
        return values;
    }

    private double[] getByProbability(int count, int[] segments, int[] probabilities) {
        assert (segments.length - 1 == probabilities.length);
        double[] values = new double[count];

        for (int i = 0; i < count; i++) {
            int segmentIndex = -1;
            int p = ThreadLocalRandom.current().nextInt(0, 100);
            int acc = 0;
            for (int k = 0; k < probabilities.length; k++) {
                acc += probabilities[k];
                if (acc > p) {
                    segmentIndex = k;
                    break;
                }
            }

            //上下限相等的特殊情况
            if (segments[segmentIndex] == (segments[segmentIndex + 1])) {
                values[i] = segments[segmentIndex];
            } else {
                int value = ThreadLocalRandom.current()
                    .nextInt(segments[segmentIndex], segments[segmentIndex + 1]);
                values[i] = value;
            }
        }

        return values;
    }


    public static void main( String[ ] args ) {
        BarChartAWT chart = new BarChartAWT("Histogram");
        chart.pack( );
//        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
    }

}
