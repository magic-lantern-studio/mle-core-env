/*
 * TitleData.java
 * Created on Jan 31, 2008
 */

// COPYRIGHT_BEGIN
// COPYRIGHT_END

// Declare package.
package simple.title;

// Import generated title classes.
import gen.MleRuntimeTables;
import gen.DppTOC;

/**
 * Data specific to the Simple title.
 * 
 * @author Mark S. Millard
 */
public class TitleData
{
    /** The name of the Digital Playprint to load. */
    public String m_playprint = null;
    /** The Runtime Engine tables. */
    public MleRuntimeTables m_tables = null;
    /** The DPP Table-of-Contents. */
    public DppTOC m_toc = null;

    /**
     * The default constructor.
     */
    public TitleData()
    {
        super();
    }
}
