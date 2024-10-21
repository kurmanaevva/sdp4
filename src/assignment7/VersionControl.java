package assignment7;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> versionHistory;
    private int currentVersion;

    public VersionControl() {
        this.versionHistory = new ArrayList<>();
        this.currentVersion = -1; // No version saved initially
    }

    public void saveVersion(Document document) {
        DocumentVersion version = document.save();
        versionHistory.add(version);
        currentVersion++;
        System.out.println("Version " + currentVersion + " saved.");
    }

    public void restoreVersion(Document document, int versionIndex) {
        if (versionIndex < 0 || versionIndex > currentVersion) {
            System.out.println("Invalid version index.");
            return;
        }
        DocumentVersion version = versionHistory.get(versionIndex);
        document.restore(version);
        System.out.println("Restored to version " + versionIndex);
    }

    public void listVersions() {
        for (int i = 0; i <= currentVersion; i++) {
            System.out.println("Version " + i + ": " + versionHistory.get(i).getContent());
        }
    }
}