OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="false" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="841.88983" PAPERHEIGHT="594.9921" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1093240872796" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="801.6379" HEIGHT="544.8189" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="더미 밴드1#%$oz*&amp;^데이터 밴드1" SRC="" />
  <OZBAND NAME="타이틀 밴드1" WIDTH="801.6379" HEIGHT="28.346457" BANDTYPE="2" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨1" WIDTH="801.6379" HEIGHT="28.346457" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="14" FONTNAME="굴림체" FONTSTYLE="1">확장목록</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="더미 밴드1" TOP="28.346457" WIDTH="801.6379" HEIGHT="50.82677" SCRIPTCODE="if (totalRowCount ( &quot;SP_PB_P_RDREXTNLST.SET_curcommlist&quot; ) == 0 ) {~OZ#CRLF    setattr (&quot;visable&quot;,&quot;true&quot;); ~OZ#CRLF}else{ ~OZ#CRLF    setattr (&quot;visable&quot;,&quot;false&quot;); ~OZ#CRLF}" BANDTYPE="10" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="11" REPEATNUM="1" PAGEENDSTOP="false">
    <ONESHAPE NAME="라벨3" TOP="11.653543" WIDTH="192.0" HEIGHT="14.173228" SCRIPTCODE="string fromDate ;~OZ#CRLFstring toDate;~OZ#CRLFfromDate = substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtfrom#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtfrom#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtfrom#, 6, 2) ;~OZ#CRLFtoDate = substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtto#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtto#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtto#, 6, 2) ;~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;,&quot;조회기간 : &quot;+fromDate+&quot; - &quot; +toDate );" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨19" TOP="35.65354" WIDTH="64.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393">배정일자</ONESHAPE>
    <ONESHAPE NAME="라벨21" LEFT="192.0" TOP="35.65354" WIDTH="66.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393">성명</ONESHAPE>
    <ONESHAPE NAME="라벨22" LEFT="258.0" TOP="35.65354" WIDTH="68.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393">매체</ONESHAPE>
    <ONESHAPE NAME="라벨23" LEFT="376.0" TOP="35.65354" WIDTH="313.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393">주소</ONESHAPE>
    <ONESHAPE NAME="라벨24" LEFT="689.0" TOP="35.65354" WIDTH="56.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393">확인매수</ONESHAPE>
    <ONESHAPE NAME="라벨26" LEFT="688.0" TOP="15.653543" WIDTH="113.63788" HEIGHT="16.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true">0  /  0</ONESHAPE>
    <ONESHAPE NAME="라벨20" LEFT="64.0" TOP="35.65354" WIDTH="64.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393">확장일자</ONESHAPE>
    <ONESHAPE NAME="라벨27" LEFT="128.0" TOP="35.65354" WIDTH="64.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393">확장번호</ONESHAPE>
    <ONESHAPE NAME="라벨28" LEFT="326.0" TOP="35.65354" WIDTH="50.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393">구독매수</ONESHAPE>
    <ONESHAPE NAME="라벨25" LEFT="744.6379" TOP="35.65354" WIDTH="56.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393">취소매수</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="데이터 헤더밴드1" TOP="79.173225" WIDTH="801.6379" HEIGHT="33.826775" BANDTYPE="5" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="3">
    <ONESHAPE NAME="라벨32" LEFT="8.0" TOP="16.0" WIDTH="192.0" HEIGHT="14.173228" SCRIPTCODE="string fromDate ;~OZ#CRLFstring toDate;~OZ#CRLFfromDate = substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtfrom#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtfrom#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtfrom#, 6, 2) ;~OZ#CRLFtoDate = substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtto#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtto#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_RDREXTNLST.OZParam.rdr_extndtto#, 6, 2) ;~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;,&quot;조회기간 : &quot;+fromDate+&quot; - &quot; +toDate );" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨31" LEFT="751.0" TOP="16.0" WIDTH="50.63788" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨34" LEFT="704.0" TOP="16.0" WIDTH="47.0" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;,#OZSystem.Page_Number#+&quot;  / &quot;);" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="113.0" WIDTH="801.6379" HEIGHT="28.346462" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="데이터 헤더밴드1" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_RDREXTNLST" MASTER="리포트1" DATASOURCENAME="SET_SP_PB_P_RDREXTNLST" SUBDATALIST="" FIXEDTITLE="true" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블1" WIDTH="799.85065" HEIGHT="28.346455" ODINAME="SP_PB_P_RDREXTNLST" DATASET="SET_curcommlist" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="false" SELLABEL="ASINDT#%$oz*&amp;^RDR_EXTNDT#%$oz*&amp;^RDR_EXTNNO#%$oz*&amp;^EXTNFLNM#%$oz*&amp;^RDRTEL_NO#%$oz*&amp;^RDRPTPH_NO#%$oz*&amp;^RDROFFITEL_NO#%$oz*&amp;^MEDICDNM#%$oz*&amp;^QTY#%$oz*&amp;^DLVADDR#%$oz*&amp;^CON_TOT#%$oz*&amp;^CAN_TOT" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="true">
      <OZTTLABEL NAME="라벨2" WIDTH="48.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="ASINDT" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="0">배정일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨4" LEFT="48.0" WIDTH="48.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="RDR_EXTNDT" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="0">확장일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨5" LEFT="96.0" WIDTH="34.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="RDR_EXTNNO" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="0">확장번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨6" LEFT="130.0" WIDTH="64.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="EXTNFLNM" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="0">성명</OZTTLABEL>
      <OZTTLABEL NAME="라벨7" LEFT="194.0" WIDTH="56.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="RDRTEL_NO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="0">자택</OZTTLABEL>
      <OZTTLABEL NAME="라벨8" LEFT="250.0" WIDTH="56.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="RDRPTPH_NO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="0">핸드폰</OZTTLABEL>
      <OZTTLABEL NAME="라벨9" LEFT="306.0" WIDTH="56.125977" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="RDROFFITEL_NO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="6" INDEX_Y="0">직장</OZTTLABEL>
      <OZTTLABEL NAME="라벨10" LEFT="362.12598" WIDTH="53.874023" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="MEDICDNM" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="7" INDEX_Y="0">매체</OZTTLABEL>
      <OZTTLABEL NAME="라벨11" LEFT="416.0" WIDTH="41.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="QTY" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="8" INDEX_Y="0">구독매수</OZTTLABEL>
      <OZTTLABEL NAME="라벨12" LEFT="457.0" WIDTH="276.87402" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="DLVADDR" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="9" INDEX_Y="0">주소</OZTTLABEL>
      <OZTTLABEL NAME="라벨13" LEFT="733.874" WIDTH="33.094727" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="CON_TOT" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="10" INDEX_Y="0">확인매수</OZTTLABEL>
      <OZTTLABEL NAME="라벨14" LEFT="766.96875" WIDTH="32.881897" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="CAN_TOT" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="11" INDEX_Y="0">취소매수</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨16" TOP="14.173225" WIDTH="48.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="ASINDT" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="1">ASINDT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨15" LEFT="48.0" TOP="14.173225" WIDTH="48.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="RDR_EXTNDT" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="1">RDR_EXTNDT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨18" LEFT="96.0" TOP="14.173225" WIDTH="34.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="RDR_EXTNNO" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="1">RDR_EXTNNO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨17" LEFT="130.0" TOP="14.173225" WIDTH="64.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="EXTNFLNM" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" INDEX_X="3" INDEX_Y="1">EXTNFLNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨29" LEFT="194.0" TOP="14.173225" WIDTH="56.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="RDRTEL_NO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="1">RDRTEL_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨30" LEFT="250.0" TOP="14.173225" WIDTH="56.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="RDRPTPH_NO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="1">RDRPTPH_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨33" LEFT="306.0" TOP="14.173225" WIDTH="56.125977" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="RDROFFITEL_NO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="6" INDEX_Y="1">RDROFFITEL_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨35" LEFT="362.12598" TOP="14.173225" WIDTH="53.874023" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="MEDICDNM" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" INDEX_X="7" INDEX_Y="1">MEDICDNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨36" LEFT="416.0" TOP="14.173225" WIDTH="41.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="QTY" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="8" INDEX_Y="1">QTY</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨37" LEFT="457.0" TOP="14.173225" WIDTH="276.87402" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="DLVADDR" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" LEFTMARGIN="5.0" INDEX_X="9" INDEX_Y="1">DLVADDR</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨38" LEFT="733.874" TOP="14.173225" WIDTH="33.094727" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="CON_TOT" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="10" INDEX_Y="1">CON_TOT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨39" LEFT="766.96875" TOP="14.173225" WIDTH="32.881897" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_RDREXTNLST" DATASETNAME="SET_curcommlist" COLNAME="CAN_TOT" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="11" INDEX_Y="1">CAN_TOT</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZBACKBAND NAME="배경1" WIDTH="801.6379" HEIGHT="544.8189" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_RDREXTNLST" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_RDREXTNLST.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_RDREXTNLST" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_curcommlist" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="rdr_extndtfrom" VALUE="20040701" />
	<PARAMFIELD FIELDNAME="rdr_extndtto" VALUE="20040830" />
	<PARAMFIELD FIELDNAME="medicd" VALUE="" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

