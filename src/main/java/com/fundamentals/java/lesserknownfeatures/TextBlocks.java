package com.fundamentals.java.lesserknownfeatures;

//Java 15 introduced text blocks (or multi-line strings)
// as a way to embed multi-line string literals directly in the source code
// without the need for concatenation.
public class TextBlocks {

    //It aids in making embedded JSON, SQL, or XML more readable.
    // The opening """ denotes the start, and the closing """ (on a new line) denotes the end.

    String html = """
            <html>
                <body>
                    <p>Hello, world</p>
                </body>
            </html>
            """;
}
