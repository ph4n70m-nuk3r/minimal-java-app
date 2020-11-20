package com.github.ph4n70m_nuk3r;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Simple application
 */
public
class App
{
    private static final String KEY__PROPERTIES_FILE = "app.properties.file";

    public static
    void
    main(String[] args)
    throws Exception
    {
		System.out.print("\n>>>>> App Started <<<<<\n\n");

        Properties props = new Properties();
        props.load(new FileInputStream(new File(System.getProperties().getProperty(KEY__PROPERTIES_FILE))));
        props.entrySet().spliterator().forEachRemaining(System.out::println);

        //noinspection InfiniteLoopStatement,StatementWithEmptyBody
        while(true) {
            // do nothing...
        }
    }
}

