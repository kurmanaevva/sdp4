package assignment7;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.setContent("Version 1: Initial draft");
        versionControl.saveVersion(document);

        document.setContent("Version 2: Added introduction");
        versionControl.saveVersion(document);

        document.setContent("Version 3: Added conclusion");
        versionControl.saveVersion(document);

        // List all saved versions
        System.out.println("\nListing all versions:");
        versionControl.listVersions();

        // Restore to an earlier version
        System.out.println("\nRestoring to version 1:");
        versionControl.restoreVersion(document, 1);
        System.out.println("Current Document Content: " + document.getContent());

        // Restore to the initial version
        System.out.println("\nRestoring to version 0:");
        versionControl.restoreVersion(document, 0);
        System.out.println("Current Document Content: " + document.getContent());
    }
}