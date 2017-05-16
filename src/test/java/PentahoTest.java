import org.junit.Before;
import org.junit.Test;
import org.pentaho.reporting.engine.classic.core.Element;
import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.engine.classic.core.SimplePageDefinition;
import org.pentaho.reporting.engine.classic.core.modules.output.pageable.base.PageableReportProcessor;
import org.pentaho.reporting.engine.classic.core.modules.output.pageable.pdf.PdfOutputProcessor;
import org.pentaho.reporting.engine.classic.core.style.ElementStyleKeys;
import org.pentaho.reporting.engine.classic.core.util.PageFormatFactory;
import org.pentaho.reporting.engine.classic.core.util.PageSize;
import org.pentaho.reporting.libraries.base.util.NullOutputStream;

import java.awt.*;
import java.awt.print.PageFormat;

/**
 * Created by norman on 12/05/17.
 */

public class PentahoTest {

    @Before
    public void initialize() {

    }

    @Test
    public void canRetryTest() {

    }

//    @Test
//    public void testPdfPrinting() throws Exception {
//        final MasterReport report = new MasterReport();
//        report.setPageDefinition( new SimplePageDefinition( PageFormatFactory.create( new PageSize( 500, 400 ),
//                PageFormat.PORTRAIT, new Insets( 0, 0, 0, 0 ) ), 1, 2 ) );
//
//        final Element topLabel = TableTestUtil.createDataItem( "Top Label" );
//        topLabel.getStyle().setStyleProperty( ElementStyleKeys.POS_Y, 0f );
//        final Element bottomLabel = TableTestUtil.createDataItem( "Bottom Label" );
//        bottomLabel.getStyle().setStyleProperty( ElementStyleKeys.POS_Y, 500f );
//        report.getReportHeader().addElement( topLabel );
//        report.getReportHeader().addElement( bottomLabel );
//
//        final PdfOutputProcessor outputProcessor =
//                new TestPdfOutputProcessor( report.getConfiguration(), new NullOutputStream() );
//        final PageableReportProcessor reportProcessor = new PageableReportProcessor( report, outputProcessor );
//        reportProcessor.processReport();
//    }


}
