OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="false" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="841.88983" PAPERHEIGHT="594.9921" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1100572864984" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="801.6379" HEIGHT="544.8189" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="더미 밴드1#%$oz*&amp;^데이터 밴드1" SRC="" />
  <OZBAND NAME="타이틀 밴드1" WIDTH="801.6379" HEIGHT="29.0" BANDTYPE="2" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨14" WIDTH="801.6379" HEIGHT="29.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="14" FONTNAME="굴림체" FONTSTYLE="1">보너스북발송</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="더미 밴드1" TOP="29.0" WIDTH="801.6379" HEIGHT="56.17323" SCRIPTCODE="if (totalRowCount ( &quot;SP_PB_P_BNSBKLST.SET_curcommlist&quot; ) == 0 ) {~OZ#CRLF    setattr (&quot;visable&quot;,&quot;true&quot;); ~OZ#CRLF}else{ ~OZ#CRLF    setattr (&quot;visable&quot;,&quot;false&quot;); ~OZ#CRLF}" BANDTYPE="10" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="10" REPEATNUM="1" PAGEENDSTOP="false">
    <ONESHAPE NAME="라벨4" LEFT="33.0" TOP="42.0" WIDTH="120.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">독자번호</ONESHAPE>
    <ONESHAPE NAME="라벨16" LEFT="153.0" TOP="42.0" WIDTH="67.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">성명</ONESHAPE>
    <ONESHAPE NAME="라벨17" LEFT="220.0" TOP="42.0" WIDTH="75.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">구독매체</ONESHAPE>
    <ONESHAPE NAME="라벨18" LEFT="295.0" TOP="42.0" WIDTH="90.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">구독기간</ONESHAPE>
    <ONESHAPE NAME="라벨19" LEFT="385.0" TOP="42.0" WIDTH="71.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">발송구분</ONESHAPE>
    <ONESHAPE NAME="라벨20" LEFT="456.0" TOP="42.0" WIDTH="89.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">보너스북</ONESHAPE>
    <ONESHAPE NAME="라벨21" LEFT="544.6379" TOP="42.0" WIDTH="256.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">주소</ONESHAPE>
    <ONESHAPE NAME="라벨22" TOP="20.0" WIDTH="194.0" HEIGHT="14.173228" SCRIPTCODE="string sendDate ;~OZ#CRLF~OZ#CRLFsendDate = substr(#SP_PB_P_BNSBKLST.OZParam.senddt#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_BNSBKLST.OZParam.senddt#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_BNSBKLST.OZParam.senddt#, 6, 2) ;~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;,&quot;발송일자 : &quot;+sendDate );~OZ#CRLF" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨23" LEFT="544.0" TOP="20.0" WIDTH="257.63788" HEIGHT="16.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2" RIGHTMARGIN="10.0">0  /  0</ONESHAPE>
    <ONESHAPE NAME="라벨30" TOP="42.0" WIDTH="33.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">순번</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="85.17323" WIDTH="801.6379" HEIGHT="34.826767" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="3" ODINAME="SP_PB_P_BNSBKLST" MASTER="리포트1" DATASOURCENAME="SENDTYPE" SUBDATALIST="데이터 밴드2#%$oz*&amp;^데이터 밴드3" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨2" LEFT="751.0" TOP="16.0" WIDTH="50.63788" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨1" LEFT="698.0" TOP="16.0" WIDTH="52.0" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;,#OZSystem.Page_Number#+&quot;  / &quot;);" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨31" LEFT="8.0" TOP="16.0" WIDTH="194.0" HEIGHT="14.173228" SCRIPTCODE="string sendDate ;~OZ#CRLF~OZ#CRLFsendDate = substr(#SP_PB_P_BNSBKLST.OZParam.senddt#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_BNSBKLST.OZParam.senddt#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_BNSBKLST.OZParam.senddt#, 6, 2) ;~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;,&quot;발송일자 : &quot;+sendDate +&quot;발송방법 : &quot;+#SP_PB_P_BNSBKLST.SET_curcommlist.SENDMTHDNM#);~OZ#CRLF" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
  </OZDATABAND>
  <OZDATABAND NAME="데이터 밴드2" TOP="120.0" WIDTH="801.6379" HEIGHT="28.346478" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_BNSBKLST" MASTER="데이터 밴드1" DATASOURCENAME="CURCOMMLIST" SUBDATALIST="" FIXEDTITLE="true" FIXEDMASTER="true" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블2" TOP="1.5258789E-5" WIDTH="801.6379" HEIGHT="28.346462" ODINAME="SP_PB_P_BNSBKLST" DATASET="CURCOMMLIST" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="true" SELLABEL="RDR_NO#%$oz*&amp;^RECPPERSNM#%$oz*&amp;^MEDICDNM#%$oz*&amp;^SUBS_SERNO#%$oz*&amp;^SENDTYPE#%$oz*&amp;^BNSBKNM#%$oz*&amp;^DLVADDR" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="false">
      <OZTTLABEL NAME="라벨3" WIDTH="32.0" HEIGHT="14.173233" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="0">순번</OZTTLABEL>
      <OZTTLABEL NAME="라벨5" LEFT="32.0" WIDTH="112.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="RDR_NO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="0">독자번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨6" LEFT="144.0" WIDTH="88.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="RECPPERSNM" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="0">성명</OZTTLABEL>
      <OZTTLABEL NAME="라벨7" LEFT="232.0" WIDTH="72.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="MEDICDNM" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="0">구독매체</OZTTLABEL>
      <OZTTLABEL NAME="라벨8" LEFT="304.0" WIDTH="80.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="SUBS_SERNO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="0">구독기간</OZTTLABEL>
      <OZTTLABEL NAME="라벨9" LEFT="384.0" WIDTH="64.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="SENDTYPE" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="0">발송구분</OZTTLABEL>
      <OZTTLABEL NAME="라벨10" LEFT="448.0" WIDTH="88.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="BNSBKNM" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="6" INDEX_Y="0">보너스북</OZTTLABEL>
      <OZTTLABEL NAME="라벨11" LEFT="536.0" WIDTH="265.63788" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="DLVADDR" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="7" INDEX_Y="0">주소</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨12" TOP="14.173233" WIDTH="32.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="CURCOMMLIST" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="1"></OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨13" LEFT="32.0" TOP="14.173233" WIDTH="112.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="CURCOMMLIST" COLNAME="RDR_NO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="1">RDR_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨15" LEFT="144.0" TOP="14.173233" WIDTH="88.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="CURCOMMLIST" COLNAME="RECPPERSNM" FONTSIZE="8" FONTNAME="굴림체" WORDWRAP="true" INDEX_X="2" INDEX_Y="1">RECPPERSNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨24" LEFT="232.0" TOP="14.173233" WIDTH="72.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="CURCOMMLIST" COLNAME="MEDICDNM" FONTSIZE="8" FONTNAME="굴림체" WORDWRAP="true" INDEX_X="3" INDEX_Y="1">MEDICDNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨25" LEFT="304.0" TOP="14.173233" WIDTH="80.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="CURCOMMLIST" COLNAME="SUBS_SERNO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="1">SUBS_SERNO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨26" LEFT="384.0" TOP="14.173233" WIDTH="64.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="CURCOMMLIST" COLNAME="SENDTYPE" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="1">SENDTYPE</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨27" LEFT="448.0" TOP="14.173233" WIDTH="88.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="CURCOMMLIST" COLNAME="BNSBKNM" FONTSIZE="8" FONTNAME="굴림체" WORDWRAP="true" INDEX_X="6" INDEX_Y="1">BNSBKNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨28" LEFT="536.0" TOP="14.173233" WIDTH="265.63788" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="CURCOMMLIST" COLNAME="DLVADDR" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" INDEX_X="7" INDEX_Y="1">DLVADDR</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZDATABAND NAME="데이터 밴드3" TOP="148.34648" WIDTH="801.6379" HEIGHT="128.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="true" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_BNSBKLST" MASTER="데이터 밴드1" DATASOURCENAME="SENDTYPE_SUM" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블1" LEFT="232.0" TOP="25.65355" WIDTH="528.0" HEIGHT="28.346462" ODINAME="SP_PB_P_BNSBKLST" DATASET="SENDTYPE_SUM" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="false" SELLABEL="SENDTYPE#%$oz*&amp;^MEDICDNM#%$oz*&amp;^BNSBKNM#%$oz*&amp;^SENDTYCNT" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="false">
      <OZTTLABEL NAME="라벨29" WIDTH="112.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="SENDTYPE" BGCOLOR="-3355393" FONTSIZE="9" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="0">발송구분</OZTTLABEL>
      <OZTTLABEL NAME="라벨32" LEFT="112.0" WIDTH="104.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="MEDICDNM" BGCOLOR="-3355393" FONTSIZE="9" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="0">매체명</OZTTLABEL>
      <OZTTLABEL NAME="라벨34" LEFT="216.0" WIDTH="208.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="BNSBKNM" BGCOLOR="-3355393" FONTSIZE="9" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="0">보너스북 명</OZTTLABEL>
      <OZTTLABEL NAME="라벨33" LEFT="424.0" WIDTH="104.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="SENDTYCNT" BGCOLOR="-3355393" FONTSIZE="9" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="0">부수</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨36" TOP="14.173233" WIDTH="112.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="SENDTYPE_SUM" COLNAME="SENDTYPE" FONTSIZE="9" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="1">SENDTYPE</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨35" LEFT="112.0" TOP="14.173233" WIDTH="104.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="SENDTYPE_SUM" COLNAME="MEDICDNM" FONTSIZE="9" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="1">MEDICDNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨38" LEFT="216.0" TOP="14.173233" WIDTH="208.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="SENDTYPE_SUM" COLNAME="BNSBKNM" FORMAT_OPTION="normal#none" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" LEFTMARGIN="10.0" INDEX_X="2" INDEX_Y="1">BNSBKNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨37" LEFT="424.0" TOP="14.173233" WIDTH="104.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_BNSBKLST" DATASETNAME="SENDTYPE_SUM" COLNAME="SENDTYCNT" FONTSIZE="9" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="1">SENDTYCNT</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZBACKBAND NAME="배경1" WIDTH="801.6379" HEIGHT="544.8189" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_BNSBKLST" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_BNSBKLST.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_BNSBKLST" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_curcommlist" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_medisendtypecur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SENDTYPE" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="CURCOMMLIST" MASTERSET="SENDTYPE" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SENDTYPE_SUM" MASTERSET="SENDTYPE" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="bocd" VALUE="b0205" />
	<PARAMFIELD FIELDNAME="senddt" VALUE="20041117" />
	<PARAMFIELD FIELDNAME="sendmthd" VALUE="30" />
	<PARAMFIELD FIELDNAME="sendkubun" VALUE="SELECT" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

