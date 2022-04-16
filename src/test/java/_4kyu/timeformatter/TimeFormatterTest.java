package _4kyu.timeformatter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Dominik_Janiga
 */
public class TimeFormatterTest {

    private TimeFormatter timeFormatter;

    @Before
    public void setUp() {

        timeFormatter = new TimeFormatter();
    }

    @Test
    public void formatDuration_shouldReturnFormattedDate_forGivenLongDuration() {

        assertEquals("1 second", timeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", timeFormatter.formatDuration(62));
        assertEquals("2 minutes", timeFormatter.formatDuration(120));
        assertEquals("1 hour", timeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", timeFormatter.formatDuration(3662));
        assertEquals("2 days, 1 hour, 2 minutes and 2 seconds", timeFormatter.formatDuration(15731080));
    }
}
