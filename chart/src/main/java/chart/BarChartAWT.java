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

        int count = 1 * 1 * 1000;
//        double[] values = getRandomDoubles(count, 20, 500);
//        double[] values = getGaussDoublesFixed(count, 100, 20, 500);
        double[] values = getByProbability(count, new int[]{20, 150, 250, 350, 500},  new int[]{50, 30, 15, 5}, 20, 500);
//        double[] values = getByProbability(count, new int[]{20, 150, 250, 350, 500},  new int[]{1, 98, 0, 1}, 20, 500);

        dataset.addSeries("Histogram",values, count);
        return dataset;
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

    private double[] getByProbability(int count, int[] segments, int[] probabilities, int min, int max) {
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

            int value = ThreadLocalRandom.current().nextInt(segments[segmentIndex], segments[segmentIndex + 1]);
            values[i] = value;
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
