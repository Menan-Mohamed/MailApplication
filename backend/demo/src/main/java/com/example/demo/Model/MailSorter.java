package com.example.demo.Model;

public class MailSorter {

    private SortStrategy sortStrategy;

    // Default constructor with SortByDate strategy
    public MailSorter() {
        this.sortStrategy = new SortByDate();
    }

    // Constructor to set a specific sorting strategy
    public MailSorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    // Set a new sorting strategy
    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    // Get the current sorting strategy
    public SortStrategy getSortStrategy() {
        return sortStrategy;
    }

    // Sort mails in the specified folder using the current strategy
    public void sortFolder(Folder folder) {
        sortStrategy.sort(folder);
    }
}
