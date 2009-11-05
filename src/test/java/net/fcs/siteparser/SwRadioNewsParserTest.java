package net.fcs.siteparser;

import net.fcs.model.NewsItem;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;

public class SwRadioNewsParserTest {
    private final String HTML = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n" +
            "<html>\n" +
            "<head>\n" +
            "<title>SW Radio Africa - Home Page</title>\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"> \n" +
            "<meta name=\"description\" content=\"SW Radio Africa is the independent voice of Zimbabwe broadcasting on the short wave\">\n" +
            "<meta name=\"keywords\" content=\"sw radio, Zimbabwe, 1197Khz, medium wave, africa, politics\">\n" +
            "<link rel=\"stylesheet\" href=\"/css%20styles/swafricastyle.css\">\n" +
            "<meta name=\"verify-v1\" content=\"CIfOqbUAj9otIbGaQaRWNm9QYABo8OSlswq29lQaugY=\"/>\n" +
            "\n" +
            "<script type=\"text/javascript\" language=\"JavaScript1.2\" src=\"Javascripts/javascript.js\"></script>\n" +
            "\n" +
            "<script type=\"text/javascript\" language=\"JavaScript1.2\" src=\"menutest/stmenu.js\"></script>\n" +
            "\n" +
            "<style type=\"text/css\">\n" +
            "<!--\n" +
            "body {\n" +
            "\tmargin-left: 0px;\n" +
            "\tmargin-top: 0px;\n" +
            "\tmargin-right: 0px;\n" +
            "\tmargin-bottom: 0px;\n" +
            "}\n" +
            "a:link {\n" +
            "\ttext-decoration: none;\n" +
            "}\n" +
            "a:visited {\n" +
            "\ttext-decoration: none;\n" +
            "}\n" +
            "a:hover {\n" +
            "\ttext-decoration: none;\n" +
            "}\n" +
            "a:active {\n" +
            "\ttext-decoration: none;\n" +
            "}\n" +
            ".style2 {font-weight: bold}\n" +
            "-->\n" +
            "</style></head>\n" +
            "<body>\n" +
            "\n" +
            "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"newlook/bg_leftnav.gif\">\n" +
            "  <!--DWLayoutTable-->\n" +
            "  <tr>\n" +
            "    <td width=\"546\"><img src=\"spacer.gif\" width=\"522\" height=\"1\" border=\"0\"></td>\n" +
            "    <td width=\"270\"><img src=\"spacer.gif\" width=\"270\" height=\"1\" border=\"0\"></td>\n" +
            "    <td width=\"320\"><img src=\"spacer.gif\" width=\"156\" height=\"1\" border=\"0\"></td>\n" +
            "    <td width=\"10\"><img src=\"spacer.gif\" width=\"1\" height=\"1\" border=\"0\"><img src=\"spacer.gif\" width=\"156\" height=\"1\" border=\"0\"></td>\n" +
            "  </tr>\n" +
            "  <tr>\n" +
            "    <td height=\"2325\" valign=\"top\"><table width=\"96%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
            "       \n" +
            "          <td colspan=\"5\" class=\"topbanner\">&nbsp;</td>\n" +
            "        </tr>\n" +
            "        <tr bgcolor=\"#FFFFFF\">\n" +
            "          <td><img src=\"spacer.gif\" width=\"148\" height=\"1\" border=\"0\"></td>\n" +
            "          <td width=\"27\"><img src=\"spacer.gif\" width=\"27\" height=\"1\" border=\"0\"></td>\n" +
            "          <td><img src=\"spacer.gif\" width=\"174\" height=\"1\" border=\"0\"></td>\n" +
            "          <td colspan=\"2\"><img src=\"spacer.gif\" width=\"174\" height=\"1\" border=\"0\"></td>\n" +
            "        </tr>\n" +
            "        <tr bgcolor=\"#000000\">\n" +
            "          <td colspan=\"2\" bgcolor=\"#FFFFFF\"><div align=\"center\"><a href=\"http://www.2bctnd.net/swra_wp\"><img src=\"/faces/podcastsmall.gif\" width=\"175\" height=\"52\" border=\"0\" ></a> </div></td>\n" +
            "          <td width=\"175\" bgcolor=\"#3C5B99\"><div align=\"center\"><a href=\"http://www.facebook.com/group.php?gid=8298598983\"><img src=\"/faces/findusface.gif\" width=\"175\" height=\"50\" border=\"0\"></a>\n" +
            "          </div></td>\n" +
            "          <td width=\"138\" bgcolor=\"#FFFFFF\"><a href=\"http://twitter.com/SWRAnews\"><img src=\"/faces/twitter2.gif\" width=\"137\" height=\"50\" border=\"0\"></a></td>\n" +
            "        <td width=\"51\" bgcolor=\"#FFFFFF\"><div align=\"right\"><a href=\"http://feeds.feedburner.com/SwradioafricaPodcast\"><img src=\"faces/rssfeed.gif\" alt=\"rss feed\" width=\"50\" height=\"50\" border=\"0\"></a></div></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td width=\"151\" height=\"2076\" valign=\"top\"><table width=153 border=0 align=\"center\" cellpadding=1 cellspacing=1 bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "              <tbody>\n" +
            "                <tr>\n" +
            "                  <td \" bgcolor=#333333 class=\"entrysmall\"></td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                  <td width=\"149\" \" bgcolor=#333333 class=\"headers\">MENU</td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "<td  bgcolor=#999999>\n" +
            "<script type=\"text/javascript\" language=\"JavaScript1.2\" src=\"Javascripts/new.js\"></script></td>\n" +
            "                </tr>\n" +
            "              <td background=\"newlook/bg_leftnav.gif\"></td>\n" +
            "                <tr>\n" +
            "                  <td><div align=\"center\"><a href=\"http://www.stagnesgokwechnshome.org/\"><img src=\"faces/stagnes091009.gif\" alt=\"Dontate to st agnes\" width=\"145\" height=\"91\" border=\"0\"></a></div></td>\n" +
            "                </tr>\n" +
            "                <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "              <tr>\n" +
            "                <td><div align=\"center\"><a href=\"http://www.treeafrica.org.uk/\"><img src=\"faces/treeafrica.gif\" alt=\"Dontate to SW Radio Africa\" width=\"145\" height=\"138\" border=\"0\"></a></div></td>\n" +
            "              </tr>\n" +
            "              <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "                <tr>\n" +
            "                  <td><a href=\"/pages/donate_to_SWRA.htm\"><img src=\"/faces/donatetoswra.gif\" alt=\"Dontate to SW Radio Africa\" width=\"134\" height=\"131\" border=\"0\"></a></td>\n" +
            "                </tr><td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "                \n" +
            "              <tr><td><div align=\"center\"><a href=\"pages/MDCmeeting.htm\"><img src=\"/faces/mdcmeetings.png\" alt=\"MDC UK forum\" width=\"131\" height=\"148\" border=\"0\"></a><br>\n" +
            "              </div></td></tr>\n" +
            "              <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "              <tr><td><div align=\"center\"><a href=\"http://zimconservation.com/\"><img src=\"/faces/zimcons.gif\" alt=\"Zimbabwe Conservation\" width=\"130\" height=\"162\" border=\"0\"></a><br>\n" +
            "              </div></td></tr>\n" +
            "              <tr>\n" +
            "                <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td></tr>\n" +
            "              <tr>\n" +
            "                <td><div align=\"center\"><a href=\"http://www.thezimbabwean.co.uk/\"><img src=\"/faces/zimbabwean250209.gif\" alt=\"The Zimbabwean\" width=\"142\" height=\"186\" border=\"0\"></a><br>\n" +
            "                </div></td></tr>\n" +
            "              <tr>\n" +
            "                <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td></tr><tr>\n" +
            "                <td><div align=\"center\"><a href=\"http://www.mediainzimbabwe.com/\"><img src=\"/images/MIZ%20BANNER.png\" alt=\"Media in ZImbabwe\" width=\"96\" height=\"95\" border=\"0\"></a><br>\n" +
            "                </div></td></tr>\n" +
            "              <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "              <tr>\n" +
            "                <td><div align=\"center\"><a href=\"http://www.wpfc.org/\"><img src=\"/faces/wpf2.gif\" alt=\"World Press\" width=\"132\" height=\"153\" border=\"0\"></a><br>\n" +
            "                </div></td></tr>\n" +
            "              <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "              \n" +
            "              <tr>\n" +
            "                <td \n" +
            "                            background=\"newlook/space_grey.gif\"><div align=\"center\"><a href=\"http://www.freemedia.at/cms/ipi/\"><img src=\"/faces/ipi2.gif\" alt=\"IPI\" width=\"71\" height=\"93\" border=\"0\"></a><br>\n" +
            "                        <span class=\"style16\">International Press Institute </span><br>\n" +
            "                </div></td></tr>\n" +
            "              <tr>\n" +
            "                <td \n" +
            "                            background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td></tr>\n" +
            "              <tr>\n" +
            "                <td \n" +
            "                            background=\"newlook/space_grey.gif\"><div align=\"center\"><span class=\"articles1\"><a href=\"http://www.zimbabwedemocracynow.com/\"><img src=\"/images/zimdemnow.jpg\" alt=\"Zim Democracy Now\" width=\"131\" height=\"119\" border=\"0\"></a></span><br>\n" +
            "                </div></td></tr>\n" +
            "              <tr>\n" +
            "                <td \n" +
            "                            background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td></tr>\n" +
            "              <tr>\n" +
            "                <td \n" +
            "                            background=\"newlook/space_grey.gif\" class=\"summit_headers\"><div align=\"left\"><a href=\"http://www.zimlinetrading.co.za/\"><img src=\"/faces/zimline_ad.jpg\" alt=\"zimline\" width=\"120\" height=\"120\" border=\"0\"></a><br>\n" +
            "                </div></td></tr>\n" +
            "              <tr>\n" +
            "                <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td></tr>\n" +
            "              <tr>\n" +
            "                <td \n" +
            "                            background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\"></td></tr>\n" +
            "          </table></td>\n" +
            "          <td colspan=\"4\" valign=\"top\"><table width=\"389\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#FFFFFF\" >\n" +
            "              <td width=\"383\" height=\"39\" bgcolor=\"#ffffff\"  class=\"new-title\">News stories for Thursday 05 November</td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#ffffff\" >\n" +
            "              <td height=\"26\" bgcolor=\"#ffffff\" class=\"entry\"><p><strong><a href=\"news051109/diamonds051109.htm\">Zim escapes diamond ban despite rampant rights abuses</a></strong><br>\n" +
            "The government’s campaign to lobby for support of the country’s continued participation in the global diamond trade has paid off, with the country escaping a ban by international diamond regulatory body, the Kimberley Process. A decision on Zimbabwe’s future was taken Thursday after two days of intense debate by Kimberley Process members in Namibia, over how to deal with a country that has openly flouted international diamond trade standards.<br>\n" +
            "              </p>\n" +
            "                </td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#ffffff\" >\n" +
            "              <td height=\"26\" bgcolor=\"#eeeeee\" class=\"entry\"><p><strong><a href=\"news051109/sadc051109.htm\">SADC summit begins in Maputo</a></strong><br>\n" +
            "                  A SADC Summit on Zimbabwe, aimed at reviving the troubled inclusive government, kicked off in Maputo, Mozambique on Thursday. Host President Armando Guebuza called on all the parties to the stalled agreement to bridge their differences over the implementation of the Global Political Agreement. </p>\n" +
            "                </td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#ffffff\" >\n" +
            "              <td height=\"26\" bgcolor=\"#ffffff\" class=\"entry\"><p><strong><a href=\"news051109/advocacy051109.htm\">Advocacy group calls for SADC monitoring force in Zimbabwe</a></strong><br>\n" +
            "Advocacy group, the Open Society Initiative for Southern Africa (OSISA) has called on SADC leaders to send a monitoring force until after free and fair election are held in 2011.OSISA director Ozias Tungwarara told SW Radio Africa that such a call was motivated by a surge of credible reports of violent crackdowns against ZANU PF opponents.<br>\n" +
            "                </p>\n" +
            "                </td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#ffffff\" >\n" +
            "              <td height=\"26\" bgcolor=\"#eeeeee\" class=\"entry\"><strong><a href=\"news051109/council051109.htm\">Harare council police go on rampage </a></strong><br>\n" +
            "There were running battles between council police and members of the public at Harare’s Fourth Street bus terminus Thursday. Problems started when a group of council police went on the rampage at the terminus looking for illegal touts, people who ‘assist’ bus conductors and drivers to fill the vehicles. </td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#ffffff\" >\n" +
            "              <td bgcolor=\"#99FFFF\" class=\"entry\"><a href=\"previousnew.htm\"><strong>See previous news reports going back to June 2005 </strong></a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#999999\" bgcolor=\"#FFFFFF\" >\n" +
            "              <td colspan=\"1\" class=\"new-title\">Key recent reports</td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"Documents/Army%20perpetrators.htm\">New list of army perpetrators of violence </a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"pages/army_list011009.htm\">June 2008 (post election) list of army perpetrators of violence </a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.kubatana.net/docs/hr/hrw_diamonds_marange_090626.pdf\">Human Rights Abuses in Marange (pdf) </a> </td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"http://www.kubatana.net/html/archive/demgg/070930kariba.asp?sector=DEMGG%20\">The Kariba draft constitution document </a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"pages/kariba300609.htm\">Presidential powers in the Kariba Draft </a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#FFFFFF\">\n" +
            "              <td  class=\"articles2\"><a href=\"/hawkins/DOLLARIZATION%5D.htm\">Dollarization and the Economy by Tony Hawkins (slide show)</a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#FFFFFF\">\n" +
            "              <td  class=\"articles1\"><a href=\"http://hub.witness.org/sites/hub.witness.org/files/Putting_it_Right.pdf\">Report on HR Violations against Zim women</a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#FFFFFF\">\n" +
            "              <td  class=\"articles2\"><a href=\"/Documents/STERP180309.pdf\">STERP recovery programme </a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#FFFFFF\">\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.state.gov/g/drl/rls/hrrpt/2008/af/119032.htm\">US Human Rights report on Zimbabwe </a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#FFFFFF\">\n" +
            "              <td  class=\"articles2\"><a href=\"/pages/linksfortalks090209.htm\">Links for information on the talks, agreement </a><a href=\"/pages/linksfortalks090209.htm\">&amp; communiques </a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#FFFFFF\">\n" +
            "              <td  class=\"articles1\"><a href=\"/pages/physiciansreport130109.htm\">Physicians Report - A Man-made Disaster in Zimbabwe </a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#FFFFFF\">\n" +
            "              <td valign=top class=\"articles2\"><a href=\"/Documents/zesn230109.pdf\">ZESN report on March election &amp; the presidential run-off</a> 180pages </td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#999999\" bgcolor=\"#FFFFFF\" >\n" +
            "              <td colspan=\"1\" class=\"new-title\">Recent Zimbabwe stories of interest </td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"http://www.independent.co.uk/news/world/africa/zimbabwe-to-escape-censure-over-abuses-in-diamond-mines-1814190.html\">Zim to escape censure over abuses in diamond mines</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.africafiles.org/article.asp?ID=22212\">Pastoral letter to the nation -</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"pages/heart051109.htm\">Heart of the Matter, November 5, 2009</a></td>\n" +
            "            </tr>\n" +
            "\n" +
            "<tr><td  class=\"articles1\"><a href=\"http://www.telegraph.co.uk/expat/6495584/Zim-mellow-days-and-heady-nights.html\">Zim: mellow days and heady nights </a></td></tr>\n" +
            "\n" +
            "<tr><td  class=\"articles2\"><a href=\"http://www.guardian.co.uk/world/2009/nov/04/zimbabwe-plane-warthog-collision\">Zimbabwe plane veers off runway after colliding with warthog </a></td></tr>\n" +
            "\n" +
            "<tr><td height=\"27\"  class=\"articles1\"><a href=\"pages/reporters041109.htm\">Reporters Without Borders</a></td></tr>\n" +
            "<tr><td  class=\"articles2\"><a href=\"pages/osisa041109.htm\">OSISA Statement : Zimbabwe: A Way Forward </a></td></tr>\n" +
            "\n" +
            "<tr><td  class=\"articles1\"> <a href=\"pages/zimdemnow041109.htm\">Zim Democracy Now weekly bulletin 3 Nov </a></td></tr>\n" +
            "\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#ffffff\" >\n" +
            "              <td height=\"26\" bgcolor=\"#ffffff\" class=\"entry\"><p><strong><a href=\"pages/widow041109.htm\">Support 79-year old widow facing charges of supplying milk </a></strong><br>\n" +
            "              </p></td>\n" +
            "            </tr>\n" +
            "\t\t\t<tr><td  class=\"articles1\"><a href=\"Documents/LM031109.pdf\">Zim lawyers for human rights weekly monitor (PDF)</a></td>\n" +
            "\t\t\t</tr>\n" +
            "<tr><td  class=\"articles2\"> <a href=\"pages/mutumwa031109.htm\">Mawere: When are you coming home</a></td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr><td  class=\"articles1\"><a href=\"pages/civilsocfumes031109.htm\">Civil society fumes over SADC snub</a></td>\n" +
            "</tr>\n" +
            "<tr><td  class=\"articles2\"><a href=\"pages/campaigners031109.htm\">Campaigners call for urgent action on Zim blood diamonds </a></td>\n" +
            "</tr>\n" +
            "\n" +
            "<tr><td  class=\"articles1\"><a href=\"http://www.flickr.com/photos/sokwanele/\">Violence on Friedewal Farm - Zimbabwe</a></td>\n" +
            "</tr>\n" +
            "<tr><td  class=\"articles2\"><a href=\"pages/summits031109.htm\">Summits on Zimbabwe are a waste of time </a></td>\n" +
            "</tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.mmegi.bw/index.php?sid=1&aid=183&dir=2009/November/Tuesday3\">Khama to miss another summit on Zim</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"http://www.mg.co.za/article/2009-11-03-zimbabwe-leaders-prepare-for-regional-summit\">Zimbabwe leaders prepare for regional summit</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.cisomm.org/\">New Zim website: Civil Society Monitoring Mechanism</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"pages/hotseat021109.htm\">HOT SEAT interview: Botswana Foreign Minister Phandu Skelemani</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.mg.co.za/article/2009-11-02-zimbabwean-beaten-to-death-in-diepsloot\">Zimbabwean beaten to death in Diepsloot</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"http://www.sokwanele.com/thisiszimbabwe/archives/5093\">Transcript: Zimbabwe's Blood Diamonds </a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#FFFFFF\" bgcolor=\"#FFFFFF\">\n" +
            "              <td valign=top bgcolor=\"#99FFFF\" class=\"articles2\"><a href=\"/pages/reports.htm\">See more recent reports </a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#999999\" bgcolor=\"#FFFFFF\" >\n" +
            "              <td colspan=\"1\" class=\"new-title\">Other things you should know </td>\n" +
            "            </tr>\n" +
            "<tr><td  class=\"articles2\"><a href=\"http://www.timesonline.co.uk/tol/news/world/africa/article6901688.ece\">Tanzania’s albinos celebrate death sentences for killers</a></td></tr>\n" +
            "\n" +
            "<tr><td  class=\"articles1\"><a href=\"http://www.timeslive.co.za/news/article181243.ece\">Witness brands Selebi a liar</a></td></tr>\n" +
            "<tr><td  class=\"articles2\"><a href=\"http://www.timeslive.co.za/news/article181515.ece\">SA olympic body suspends athletics president </a></td></tr>\n" +
            "\n" +
            "<tr><td  class=\"articles1\"><a href=\"http://news.bbc.co.uk/1/hi/world/africa/8341836.stm\">SA 'to miss land reform deadline' </a></td></tr>\n" +
            "<tr><td  class=\"articles2\"><a href=\"http://www.mg.co.za/article/2009-11-05-ill-testify-against-thatcher-says-mann\">I'll testify against Thatcher, says Mann </a></td></tr>\n" +
            "\n" +
            "<tr><td  class=\"articles1\"><a href=\"http://www.iol.co.za/index.php?set_id=6&click_id=4&art_id=nw20091105105132734C554602&newslett=1&em=53829a6a20091105ah\">Will 2010 stadiums survive?</a></td></tr>\n" +
            "<tr><td  class=\"articles2\"><a href=\"http://www.iol.co.za/index.php?newslett=1&em=53829a6a20091105ah&click_id=68&art_id=nw20091105113029758C698144&set_id=1\"> SA won't charge freed E Guinea mercenaries </a></td></tr>\n" +
            "\n" +
            "<tr><td  class=\"articles1\"><a href=\"http://www.iol.co.za/index.php?set_id=1&click_id=79&art_id=nw20091105103257757C459045&newslett=1&em=53829a6a20091105ah\">Zuma asked to intervene to end bull-killing ritual</a></td></tr>\n" +
            "<tr><td  class=\"articles2\"><a href=\"http://www.iol.co.za/index.php?set_id=1&click_id=79&art_id=nw20091105113854520C993624&newslett=1&em=53829a6a20091105ah\">SA Airbus contract cancelled </a></td></tr>\n" +
            "<tr>\n" +
            "  <td  class=\"articles1\"><a href=\"pages/rwanda041109.htm\">Should Rwanda be admitted to the Commonwealth?</a></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "  <td  class=\"articles2\"><a href=\"pages/africagovs041109.htm\">Amnesty - Africa govts must reaffirm commitment to ICC</a></td>\n" +
            "</tr>\n" +
            "\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.telegraph.co.uk/news/worldnews/africaandindianocean/equatorialguinea/6501078/Simon-Mann-very-anxious-for-Sir-Mark-Thatcher-to-face-justice.html\">Simon Mann 'anxious' for Mark Thatcher to face justice</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"http://www.iol.co.za/index.php?set_id=1&click_id=13&art_id=vn20091104043857889C777366&newslett=1&em=53829a6a20091104ah\">Young ANC leaders lack integrity</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.iol.co.za/index.php?newslett=1&em=53829a6a20091104ah&click_id=13&art_id=vn20091104041124237C387583&set_id=1\">Cosatu Gen Sec salary doubled</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"http://www.iol.co.za/index.php?set_id=1&click_id=79&art_id=nw20091104112501668C766620&newslett=1&em=53829a6a20091104ah\">Selebi and the envelopes stuffed with cash</a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#FFFFFF\" bgcolor=\"#FFFFFF\">\n" +
            "              <td class=\"new-title\">&nbsp;Wildlife &amp; environment in trouble articles </td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.africafiles.org/article.asp?ID=22208\">From toxic waste to toxic assets -</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"http://www.telegraph.co.uk/earth/earthpicturegalleries/6486508/Life-on-White-Belgian-team-photograph-animals-on-white-backgrounds.html\">The beauty of animals </a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><a href=\"http://www.telegraph.co.uk/science/space/6493006/Planets-spotted-outside-our-own-galaxy-for-first-time.html\">Planets 'spotted' outside our own galaxy for first time</a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"pages/cfusos031109.htm\">CFU SOS for the animals</span></a></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles1\"><A href=\"http://af.reuters.com/article/topNews/idAFJOE5A20BH20091103\">Quarter of Zimbabwe's rhinos killed by poachers</A></FONT></td>\n" +
            "            </tr>\n" +
            "            <tr>\n" +
            "              <td  class=\"articles2\"><a href=\"http://www.guardian.co.uk/environment/2009/nov/03/global-warming-climate-refugees\">150 million 'climate refugees' by 2050?</a></td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#FFFFFF\" bgcolor=\"#FFFFFF\">\n" +
            "              <td colspan=\"1\" bgcolor=\"#FFFFCC\" class=\"small-time2\">SW Radio Africa can take no responsibility for views, opinions or web content outside of its control</td>\n" +
            "            </tr>\n" +
            "            <tr bordercolor=\"#333333\" bgcolor=\"#333333\">\n" +
            "              <td height=\"293\" bgcolor=\"#666666\" class=\"menulink\"><table width=\"382\" border=0 cellspacing=0>\n" +
            "                  <tbody>\n" +
            "                    <tr>\n" +
            "                      <td width=\"380\" align=left valign=bottom bordercolor=\"#333333\" bgcolor=\"#CE3031\"><div align=\"left\"><span class=\"style2\"><span class=\"articles2\"><img src=\"newverts/buckle.gif\" width=\"342\" height=\"37\"></span></span></div></td>\n" +
            "                    </tr>\n" +
            "                    <tr>\n" +
            "                      <td  class=\"buckle\"><p>Dear Family and Friends,<br>\n" +
            "                A little before midday on the second last day of October it rained for the first time in six months in my home town. The rain was neither heavy nor prolonged but just enough to wet the dust and cut through the searing heat which had reduced most of us to melting pools.<a href=\"pages/buckle021109.htm\"><em><br>\n" +
            "                Read more </em></a>   </td>\n" +
            "                    </tr>\n" +
            "                  </tbody>\n" +
            "              </table></td>\n" +
            "            </tr>\n" +
            "          </table></td>\n" +
            "    </tr></table></td>\n" +
            "\t\t\t\n" +
            "    <td valign=\"top\" background=\"newlook/bg_topbit2.gif\">\n" +
            "      <table width=\"270\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#666666\">\n" +
            "        <tr bgcolor=\"#FFFFFF\"> \n" +
            "          <td width=\"270\"><a href=\"javascript:openWindow(330,340)\"><img src=\"newlook/listenlive.gif\" alt=\"listen live\" width=\"270\" height=\"45\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "        <tr bgcolor=\"#FFFFFF\"> \n" +
            "          <td bgcolor=\"#000000\"><div align=\"center\"><img src=\"faces/blooddiamonds051109.jpg\" width=\"270\" height=\"125\"></div></td>\n" +
            "        </tr>\n" +
            "        <tr bgcolor=\"#FFFFFF\"> \n" +
            "          <td bgcolor=\"#F0EFdB\" class=\"small-time2\">It is great news for <strong>Zanu PF</strong>  top brass who will be allowed to sell blood diamonds on the international market. Zimbabwe has escaped a ban by the international diamond regulatory body, the Kimberley Process. This is despite a massacre of 200 people last year at the Chiadzwa diamond mine  (<a href=\"http://www.kubatana.net/html/archive/hr/090626hrw.asp?sector=HR\"><em>see HRW report</em></a>) and a recent review mission sent by the regulatory body that reported on mass violations, smuggling, rampant human rights abuse and evidence of atrocities committed by soldiers.</td>\n" +
            "        </tr>\n" +
            "      \n" +
            "        <tr bordercolor=\"#999999\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\">\n" +
            "          <td valign=\"middle\" class=\"new-title\">Thursday Schedule </td>\n" +
            "        </tr>\n" +
            "        <tr bordercolor=\"#999999\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\">\n" +
            "          <td valign=\"middle\" ><table width=\"264\" border=\"0\" bgcolor=\"#FFFFFF\" bordercolor=\"#999999\" cellpadding=\"0\" cellspacing=\"2\" bordercolordark=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" align=\"center\">\n" +
            "              <tr>\n" +
            "                <td rowspan=\"2\" bgcolor=\"#eeeeee\" class=\"small-time\"><div align=\"left\">6.00-6.30</div></td>\n" +
            "                <td width=\"90%\" bgcolor=\"#eeeeee\" class=\"small-time\" ><b>Station Opening </b>with Mandisa</td>\n" +
            "              </tr>\n" +
            "              <tr>\n" +
            "                <td width=\"90%\" bgcolor=\"#eeeeee\" class=\"small-time\"><b>Newsreel</b></td>\n" +
            "                </tr>\n" +
            "              <tr>\n" +
            "                <td bgcolor=\"#eeeeee\" class=\"small-time\">6.30- 7.00</td>\n" +
            "                <td width=\"90%\" bgcolor=\"#eeeeee\" class=\"small-time\"><strong>Heart of the Matter </strong> with Tano Whande<br>\n" +
            "                    <strong>Behind the Headlines</strong> with Lance Guma </td>\n" +
            "              </tr>\n" +
            "              <tr>\n" +
            "                <td bgcolor=\"#eeeeee\" class=\"small-time\">7.00-7.30</td>\n" +
            "                <td width=\"90%\" bgcolor=\"#eeeeee\" class=\"small-time\"><b>Callback </b>with Mandisa</td>\n" +
            "              </tr>\n" +
            "              <tr>\n" +
            "                <td bgcolor=\"#eeeeee\" class=\"small-time\"><div align=\"left\">7.30-8.00</div></td>\n" +
            "                <td width=\"90%\" bgcolor=\"#eeeeee\" class=\"small-time\"><b> <b><b>Newsreel</b></b></b> (repeat) </td>\n" +
            "              </tr>\n" +
            "          </table></td>\n" +
            "        </tr>\n" +
            "        <tr bgcolor=\"#FFFFFF\">\n" +
            "          <td valign=\"top\" bordercolor=\"#999999\" bordercolorlight=\"#ffffff\" bordercolordark=\"#ffffff\" class=\"new-title\">Thursday Downloads </td>\n" +
            "        </tr>\n" +
            "        <tr bgcolor=\"#FFFFFF\">\n" +
            "          <td valign=\"top\" bordercolor=\"#999999\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\"><table width=269 height=\"203\" border=0 align=center cellpadding=0 \n" +
            "            cellspacing=2 bordercolor=#999999 bordercolorlight=#ffffff \n" +
            "            bordercolordark=#ffffff bgcolor=#ffffff>\n" +
            "              <tr bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\">\n" +
            "                <td width=\"265\" height=\"37\" valign=\"middle\" bgcolor=\"#FFFFFF\" class=\"smalldark\" ><i>From 19:30 GMT, the following archives will be available. <a href=\"pages/macarchives.php\"><font color=\"#CC0000\">Mac users</font></a></i>         \n" +
            "              </tr>\n" +
            "              <tr  bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\">\n" +
            "                <td height=\"25\" valign=\"middle\" class=\"entryboldred1\" ><a href=\"mms://swradioafrica.streamuk.com/swradioafrica_archive/051109whole.wma\"><strong>Full two hour broadcast</strong> </a>               \n" +
            "              </tr>\n" +
            "              <tr  bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\">\n" +
            "                <td height=\"25\" valign=\"middle\" class=\"entryboldred1\" ><a href=\"mms://swradioafrica.streamuk.com/swradioafrica_archive/heads051109.wma\">News Headlines</a>               \n" +
            "              </tr>\n" +
            "              <tr  bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\">\n" +
            "                <td height=\"25\" valign=\"middle\" class=\"entryboldred1\" ><a href=\"mms://swradioafrica.streamuk.com/swradioafrica_archive/newsreel051109.wma\" ><b>Newsreel</b></a>               \n" +
            "              </tr>\n" +
            "              <tr  bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\">\n" +
            "                <td height=\"25\" valign=\"middle\" bgcolor=\"#eeeeee\" class=\"entryboldred1\" ><b><a href=\"mms://swradioafrica.streamuk.com/swradioafrica_archive/hm051109.wma\">The Heart of the Matter </a></b>               \n" +
            "              </tr>\n" +
            "              <tr bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\">\n" +
            "                <td height=\"25\" valign=\"middle\" class=\"entryboldred1\" ><b><a href=\"mms://swradioafrica.streamuk.com/swradioafrica_archive/callback051109.wma\">Callback</a></b>               \n" +
            "              </tr>\n" +
            "              <tr bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\">\n" +
            "                <td height=\"25\" valign=\"middle\" class=\"entryboldred1\" ><b><a href=\"mms://swradioafrica.streamuk.com/swradioafrica_archive/bth051109.wma\">Behind the Headlines </a></b>               \n" +
            "              </tr>\n" +
            "              <tbody>\n" +
            "              </tbody>\n" +
            "          </table></td>\n" +
            "        </tr>\n" +
            "        <!-- Schedule -->\n" +
            "        <!-- Downloads -->\n" +
            "           <tr>\n" +
            "             <td bgcolor=\"#660000\"><a href=\"http://www.avaaz.org/en/diamonds_for_love_not_hate/?cl=359586418&v=4403\"><img src=\"faces/avaaz-diamonds041109.jpg\" width=\"270\" height=\"91\" border=\"0\"></a></td>\n" +
            "           </tr>\n" +
            "           <tr>\n" +
            "          <td bgcolor=\"#660000\"><img src=\"/faces/spacer1.gif\" width=\"1\" height=\"6\"></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td bgcolor=\"#660000\"><a href=\"pages/diamonds031109.htm\"><img src=\"faces/chiadzwabanner.jpg\" width=\"270\" height=\"89\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "       <tr>\n" +
            "          <td bgcolor=\"#660000\"><img src=\"/faces/spacer1.gif\" width=\"1\" height=\"6\"></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td bgcolor=\"#660000\"><a href=\"http://www.guardian.co.uk/activate/video-gerry-jackson-sw-radio-africa\"><img src=\"faces/activate180809.gif\" width=\"270\" height=\"52\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td bgcolor=\"#660000\" width=\"270\"></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td bgcolor=\"#660000\" width=\"270\"></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td bgcolor=\"#660000\" width=\"270\"></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td bgcolor=\"#660000\"><img src=\"/faces/spacer1.gif\" width=\"1\" height=\"6\"></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td bgcolor=\"#660000\"></td>\n" +
            "        </tr>\n" +
            "        <tr> \n" +
            "          <td bgcolor=\"#660000\"><a href=\"http://www.zimvigil.co.uk/\"><img src=\"/images/zimvigsmall.gif\" alt=\"Nestle\" width=\"270\" height=\"66\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "        <tr> \n" +
            "          <td bgcolor=\"#660000\"><img src=\"/faces/spacer1.gif\" width=\"1\" height=\"6\"></td>\n" +
            "        </tr>\n" +
            "        <tr> \n" +
            "          <td bgcolor=\"#660000\"><a href=\"pages/musicprog101009.htm\"><img src=\"/faces/musicmakers.gif\" alt=\"disc jockeys\" width=\"270\" height=\"42\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "        <tr> \n" +
            "          <td bgcolor=\"#660000\"><img src=\"/faces/spacer1.gif\" width=\"1\" height=\"6\"></td>\n" +
            "        </tr>\n" +
            "        <tr> \n" +
            "          <td bgcolor=\"#660000\"><a href=\"http://www.sokwanele.com/\"><img src=\"/faces/sokwan121108.jpg\" alt=\"sokwanele\" width=\"270\" height=\"43\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "        <tr> \n" +
            "          <td bgcolor=\"#660000\"><img src=\"/faces/spacer1.gif\" width=\"1\" height=\"6\"></td>\n" +
            "        </tr>\n" +
            "        <tr> \n" +
            "          <td ><a href=\"/pages/Heartofthematter.htm\"><img src=\"/faces/matterbanner.gif\" alt=\"heart of the matter\" width=\"268\" height=\"46\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "\t\t\n" +
            "\t\t\n" +
            "        <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "          <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" class=\"new-title\">Blogspot</td>\n" +
            "        </tr>\n" +
            "        <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "          <td  class=\"blogs\"><a href=\"http://blogs.fco.gov.uk/roller/harare/\">UK in Zim: FCO blog</a> <br>\n" +
            "              <a href=\"http://zimupdate.blogspot.com/\">Zim Update</a><br>\n" +
            "              <a href=\"http://zimcop.blogspot.com/\">Zimbabwe Republic Police </a> <br>\n" +
            "              <a href=\"http://kickmugabeout.blogspot.com/\">Kick Mugabe Out</a> <br>\n" +
            "              <a href=\"http://blogs.thetimes.co.za/hartley\">Ray Hartley SA Times blog </a><br>\n" +
            "              <a href=\"http://kubatanablogs.net/kubatana/\">Kubatana Blog</a><br>\n" +
            "              <a href=\"http://unite.blogcatalog.com/\">Bloggers for Human Rights</a><br>\n" +
            "              <a href=\"http://www.z-cr.blogspot.com/\">Di Mitchells blog</a> <br>\n" +
            "              <a href=\"http://danielmolokele.blogspot.com/\">Daniel Molekele</a><br>\n" +
            "              <a href=\"http://www.sokwanele.com/thisiszimbabwe/\">Sokwanele blog</a> <br>\n" +
            "              <a href=\"http://www.zimbabwetoday.co.uk/\">Zimbabwe Today</a><br>\n" +
            "              <a href=\"http://thebeardedman.blogspot.com/\">The Bearded Man</a><br>\n" +
            "              <a href=\"http://www.zimfinalpush.blogspot.com\">The Zimbabwe Digest</a><br>\n" +
            "              <a href=\"http://www.comradefatso.vox.com\">Comrade Fatso </a></td>\n" +
            "        </tr>\n" +
            "\t\t\n" +
            "\n" +
            "\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\"  bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"new-title\">Programmes</td>\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\"  bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"callback\"><p> Mo says things are at a standstill in Zimbabwe. The politicians are continuing to destroy the nation and it’s the ordinary people like him who are suffering, and, Freedom Fighter says Zimbabweans in the UK are very concerned about the UK government’s decision to begin forcefully repatriating failed asylum seekers.<br>\n" +
            "    </p></td>\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\"  bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"><img src=\"/faces/heartofthematter.jpg\" width=\"269\" height=\"93\"></td>\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\"  bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"small-time2\"><p>Tanonoka asks how, “Robert Mugabe manages to thumb his nose at every country in this world, including organizations to which we belong, and still get away with it without so much as an admonishment.” To read a transcript of Tanonoka Joseph Whande’s monologue:<a href=\"pages/heart051109.htm\"><em><strong> Click here </strong></em></a></p>\n" +
            "      </td>\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\"  bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"behindtheheadlines\">Alex Bell stands in for Lance and looks at the latest edition of The Legal Monitor, a newsletter published by Zim Lawyers for Human Rights. Communications Officer Kumbirai Mafunda gives details about the stories, which include the recent arrests of NGO officials, the abduction and torture of the MDC’s transport manager and the ‘mafia-style’ invasion of a farm by the Deputy Reserve Bank Governor. </td>\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\"  bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"hotseat\">Violet's guest is Botswana’s Foreign Affairs Minister, Phandu Skelemani, who gives his country’s position on the present crisis in Zimbabwe. <a href=\"mms://swradioafrica.streamuk.com/swradioafrica_archive/hotseat301009.wma\"><em>Listen here </em></a></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >\n" +
            "  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "        <!-- Blogs -->\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td colspan=\"1\" valign=\"middle\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\"></td>\n" +
            "  </tr>\n" +
            "  \n" +
            "  <tr valign=\"top\" bordercolor=\"#999999\">\n" +
            "    <td valign=\"middle\" bordercolor=\"#FFFFFF\" bordercolorlight=\"#FFFFFF\" bordercolordark=\"#FFFFFF\" bgcolor=\"#FFFFFF\" class=\"entry\" >  </tr>\n" +
            "      </table>    \n" +
            "    <td valign=\"top\" bgcolor=\"#333333\"><table width=\"160\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n" +
            "        <tr>\n" +
            "          <td><img src=\"newlook/flag.gif\" alt=\"zim flag\" width=\"160\" height=\"93\"></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td><script language=\"JavaScript\" src=\"http://www.micropoll.com/akira/MicroPoll?id=214318\"></script></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td><a href=\"http://www.iomuk.org/\"><img src=\"/images/iom8.gif\" alt=\"iom\" width=\"160\" height=\"500\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td width=\"160\" hieght=\"600\"></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          \n" +
            "              <td valign=\"top\" >\n" +
            "         </td>             \n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td valign=\"top\"  href=\"/pages/price_list.htm\"><a href=\"http://www.vardensafaris.com/\"><img src=\"faces/vardensafaris.jpg\" width=\"160\" height=\"500\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td valign=\"top\"  href=\"/pages/price_list.htm\"><a href=\"http://www.mozambiquehorsesafari.com/\"><img src=\"/faces/500x160all.gif\" alt=\"horse safari\" width=\"160\" height=\"591\" border=\"0\"></a></td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "          <td  href=\"/pages/price_list.htm\"><img src=\"/newverts/160x600a.gif\" alt=\"advertise\" width=\"160\" height=\"600\" border=\"0\"></td>\n" +
            "        </tr>\n" +
            "    </table></td>\n" +
            "    <td valign=\"top\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"160\">\n" +
            "      <tr>\n" +
            "        <td><div align=\"center\"><a href=\"http://www.douglasrogers.org/\"><img src=\"faces/lastresort.gif\" alt=\"chaz\" name=\"Chaz_MaviyaneDavies_r1_c1\" width=\"150\" height=\"198\" border=\"0\"></a></div></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>      \n" +
            "      <!-- fwtable fwsrc=\"Untitled\" fwbase=\"Chaz_Maviyane-Davies.jpg\" fwstyle=\"Dreamweaver\" fwdocid = \"742308039\" fwnested=\"0\" -->\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td height=\"81\"><div align=\"center\"><a href=\"http://www.randomhouse.co.uk/catalog/book.htm?command=Search&db=main.txt&eqisbndata=0224086111\"><img src=\"/faces/hararenorth.jpg\" alt=\"harare north\" width=\"145\" height=\"199\" border=\"0\"></a></div></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>      \n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td height=\"81\"><div align=\"center\"><a href=\"http://reviews.book.co.za/blog/2009/07/20/michiel-heyns-reviews-absent-the-english-teacher-by-john-eppel/\"><img src=\"faces/ABSENT_COVER.jpg\" alt=\"brian \" width=\"145\" height=\"152\" border=\"0\"></a></div></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>      \n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td height=\"81\"><div align=\"center\"><a href=\"http://www.zimbojam.com/columns/noticeboard/812-demons-gods-english-teachers-two-new-titles-from-weaver-press.html\"><img src=\"faces/whitegods.jpg\" alt=\"elergy for easterly\" width=\"145\" height=\"152\" border=\"0\" /></a></div></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td height=\"81\"><div align=\"center\"><a href=\"/Documents/TheElephantsandI230309.pdf\" title=\"Link to the official World AIDS Day website\"><img src=\"/faces/elephant&1.jpg\" alt=\"elephants and I\" width=\"145\" height=\"187\" border=\"0\" /></a></div></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\"><td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td><div align=\"center\"><a href=\"/pages/jillbaker180309.htm\"><img src=\"/faces/BelovedAfrican1.jpg\" alt=\"beloved african\" width=\"145\" height=\"195\" border=\"0\"></a></div></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\"><td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td bgcolor=\"#333333\"><div align=\"center\"><a href=\"/pages/innocentvictims250309.htm\"><img src=\"/faces/innocent230209.jpg\" alt=\"Innocent Victims\" width=\"145\" height=\"223\" border=\"0\"></a><br>\n" +
            "        </div></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td height=\"118\" bgcolor=\"#333333\"><div align=\"center\"><a href=\"/Documents/GoingHome250309.pdf\"><img src=\"/faces/goinghome.jpg\" alt=\"going home\" width=\"140\" height=\"187\" border=\"0\"></a><br>\n" +
            "        </div></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\"><td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td height=\"118\" bgcolor=\"#333333\"><div align=\"center\"><a href=\"http://savezimbabwenow.com/\"><img src=\"/faces/savzimnow.gif\" alt=\"save zimbabwe\" width=\"145\" height=\"108\" border=\"0\"></a><br>\n" +
            "        </div></td>\n" +
            "      </tr>\n" +
            "      <tr>\n" +
            "        <td><a href=\"/chaz/large/HRBZ4.jpg\"><img name=\"Chaz_MaviyaneDavies_r3_c1\" src=\"/chaz/Chaz_Maviyane-Davies_r3_c1.jpg\" width=\"160\" height=\"144\" border=\"0\"></a></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>      \n" +
            "      <tr>\n" +
            "        <td><a href=\"/chaz/large/HRBZ3.jpg\"><img name=\"Chaz_MaviyaneDavies_r4_c1\" src=\"/chaz/Chaz_Maviyane-Davies_r4_c1.jpg\" width=\"159\" height=\"131\" border=\"0\"></a></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>      \n" +
            "      <tr>\n" +
            "        <td><a href=\"/chaz/large/HRBZ2.jpg\"><img name=\"Chaz_MaviyaneDavies_r5_c1\" src=\"/chaz/Chaz_Maviyane-Davies_r5_c1.jpg\" width=\"160\" height=\"111\" border=\"0\"></a></td>\n" +
            "      </tr>\n" +
            "      <tr bordercolor=\"#333333\" bgcolor=\"#666666\">\n" +
            "        <td background=\"newlook/bg_leftnav.gif\" class=\"summit_headers\">&nbsp;</td>      \n" +
            "      \n" +
            "    </table></td>\n" +
            "  </tr>\n" +
            "</table>\n" +
            "</body>\n" +
            "</html>";
    @Test
    public void shouldGenerateListOfNewsItemsFromSwRadioHtml() throws Exception {
        SwRadioNewsParser radioNewsParser = new SwRadioNewsParser();
        List<NewsItem> items = radioNewsParser.processNews(HTML);
        assertEquals(items.size(), 5);
        assertEquals(items.get(0).getHeadline(), "Zim escapes diamond ban despite rampant rights abuses");

    }
}


