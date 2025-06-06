package threadsconcept.scenariobased;

class FileUploader extends Thread {
    private String fileName;

    public FileUploader(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Uploading " + fileName + " started...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Uploading " + fileName + " completed.");
    }
}

public class UploadManager {
    public static void main(String[] args) {
        String[] files = {"doc1.pdf", "image.png", "report.xls"};

        for (String file : files) {
            new FileUploader(file).start();
        }
    }
}

