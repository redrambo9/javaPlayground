package com.fundamentals.java.lesserknownfeatures;

import java.util.HashSet;
import java.util.Set;

class Pair {
    String message;
    long timeStamp;

    public Pair(String message, long timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }
}

public class MessageProcessor {
    private final Set<String> uniqueMessages = new HashSet<>();
    private final Set<Pair> processedMessages = new HashSet<>();

    public void processMessage(int timestamp, String message) {
        long currentTimestamp = timestamp * 1000L; // Convert to milliseconds

        if (!uniqueMessages.contains(message)) {
            System.out.println(timestamp + " " + message);
            uniqueMessages.add(message);
            processedMessages.add(new Pair(message, currentTimestamp));
        } else {
            Pair existingPair = findPairByMessage(message);
            if (existingPair != null && currentTimestamp - existingPair.timeStamp >= 10000) {
                System.out.println(timestamp + " " + message);
                existingPair.timeStamp = currentTimestamp;
            }
        }
    }

    private Pair findPairByMessage(String message) {
        for (Pair pair : processedMessages) {
            if (pair.message.equals(message)) {
                return pair;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MessageProcessor processor = new MessageProcessor();

        processor.processMessage(10, "solar panel activated");
        processor.processMessage(11, "low battery");
        processor.processMessage(12, "tire one: low air pressure");
        processor.processMessage(13, "solar panel activated");
        processor.processMessage(14, "low battery");
        processor.processMessage(21, "solar panel activated");
        processor.processMessage(35, "solar panel activated");
    }
}

