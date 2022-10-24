package kata3git;

public class Kata3Git {

    public static void main(String[] args) {
        // Versión 2
        Histograma<String> histogram = new Histograma();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("eii.ulpgc.es");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "HISTOGRAMA");
        histogramDisplay.execute();

    }
    
}
