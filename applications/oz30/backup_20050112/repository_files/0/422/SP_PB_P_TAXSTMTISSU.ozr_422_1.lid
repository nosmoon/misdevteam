OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="0" PAPERWIDTH="594.9921" PAPERHEIGHT="841.8897" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1089376977812" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="554.7402" HEIGHT="791.7165" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="더미 밴드1#%$oz*&amp;^데이터 밴드1" SRC="" />
  <OZBAND NAME="타이틀 밴드1" WIDTH="554.7402" HEIGHT="28.346457" BANDTYPE="2" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨2" WIDTH="554.0" HEIGHT="28.0" PAINTALLOW="1" FONTSIZE="10" FONTSTYLE="1">세금 계산서 발행 리스트</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="더미 밴드1" TOP="28.346457" WIDTH="554.7402" HEIGHT="38.0" SCRIPTCODE="if (totalRowCount ( &quot;SP_PB_P_TAXSTMTISSU.SET_ov_curcommlist&quot;) == 0 ) {~OZ#CRLF    setattr (&quot;visable&quot;,&quot;true&quot;); ~OZ#CRLF}else{ ~OZ#CRLF    setattr (&quot;visable&quot;,&quot;false&quot;); ~OZ#CRLF}~OZ#CRLF" BANDTYPE="10" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="2" REPEATNUM="0" PAGEENDSTOP="false">
    <OZTABLESTATIC NAME="고정 테이블1" TOP="18.000002" WIDTH="552.0" HEIGHT="14.173228">
      <OZTABLELABEL NAME="라벨1" WIDTH="112.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" LEFT="0.0" TOP="18.000002" INDEX_X="0" INDEX_Y="0" INDEX_W="1" INDEX_H="1">독자번호</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨3" LEFT="112.0" WIDTH="72.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="18.000002" INDEX_X="1" INDEX_Y="0" INDEX_W="1" INDEX_H="1">성명</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨4" LEFT="184.0" WIDTH="56.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="18.000002" INDEX_X="2" INDEX_Y="0" INDEX_W="1" INDEX_H="1">매체명</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨5" LEFT="240.0" WIDTH="72.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="18.000002" INDEX_X="3" INDEX_Y="0" INDEX_W="1" INDEX_H="1">발급일자</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨6" LEFT="312.0" WIDTH="72.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="18.000002" INDEX_X="4" INDEX_Y="0" INDEX_W="1" INDEX_H="1">발급여부</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨7" LEFT="384.0" WIDTH="168.0" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="18.000002" INDEX_X="5" INDEX_Y="0" INDEX_W="1" INDEX_H="1">담당자/비고</OZTABLELABEL>
    </OZTABLESTATIC>
    <ONESHAPE NAME="라벨8" TOP="2.000002" WIDTH="184.0" HEIGHT="13.653542" SCRIPTCODE="string fromDate,toDate ;~OZ#CRLFfromDate  = substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtbgn#,0,4)+ &quot;/&quot; + substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtbgn#,4,2)+&quot;/&quot;+ substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtbgn#,6,2);~OZ#CRLFtoDate  = substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtend#,0,4)+&quot;/&quot;+ substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtend#,4,2)+ &quot;/&quot; +substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtend#,6,2);~OZ#CRLFsetattr(&quot;caption&quot;, &quot;  조회일자 : &quot;      + fromDate +&quot; - &quot; +toDate);~OZ#CRLF~OZ#CRLF~OZ#CRLF~OZ#CRLF" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true"></ONESHAPE>
  </OZBAND>
  <OZBAND NAME="데이터 헤더밴드1" TOP="66.34646" WIDTH="554.7402" HEIGHT="24.480316" BANDTYPE="5" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨21" TOP="3.4803162" WIDTH="184.0" HEIGHT="19.0" SCRIPTCODE="string fromDate,toDate ;~OZ#CRLFfromDate  = substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtbgn#,0,4)+ &quot;/&quot; + substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtbgn#,4,2)+&quot;/&quot;+ substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtbgn#,6,2);~OZ#CRLFtoDate  = substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtend#,0,4)+&quot;/&quot;+ substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtend#,4,2)+ &quot;/&quot; +substr(#SP_PB_P_TAXSTMTISSU.OZParam.iv_taxstmtissudtend#,6,2);~OZ#CRLFsetattr(&quot;caption&quot;, &quot;  조회일자 : &quot;      + fromDate +&quot; - &quot; +toDate);~OZ#CRLF~OZ#CRLF~OZ#CRLF~OZ#CRLF" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true"></ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="90.826775" WIDTH="554.7402" HEIGHT="28.346462" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="데이터 헤더밴드1" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_TAXSTMTISSU" MASTER="리포트1" DATASOURCENAME="SET_ov_curcommlist" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블1" TOP="7.6293945E-6" WIDTH="552.0" HEIGHT="28.346455" ODINAME="SP_PB_P_TAXSTMTISSU" DATASET="SET_ov_curcommlist" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="false" SELLABEL="RDR_NO#%$oz*&amp;^RDRNM#%$oz*&amp;^MEDINM#%$oz*&amp;^TAXSTMTISSUDT#%$oz*&amp;^TAXSTMTEXNENM#%$oz*&amp;^TAXSTMTKIND" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="false">
      <OZTTLABEL NAME="라벨9" WIDTH="112.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="RDR_NO" BGCOLOR="-3355393" INDEX_X="0" INDEX_Y="0">독자번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨10" LEFT="112.0" WIDTH="72.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="RDRNM" BGCOLOR="-3355393" INDEX_X="1" INDEX_Y="0">성명</OZTTLABEL>
      <OZTTLABEL NAME="라벨11" LEFT="184.0" WIDTH="64.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="MEDINM" BGCOLOR="-3355393" INDEX_X="2" INDEX_Y="0">매체명</OZTTLABEL>
      <OZTTLABEL NAME="라벨12" LEFT="248.0" WIDTH="72.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="TAXSTMTISSUDT" BGCOLOR="-3355393" INDEX_X="3" INDEX_Y="0">발급일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨13" LEFT="320.0" WIDTH="61.259827" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="TAXSTMTEXNENM" BGCOLOR="-3355393" INDEX_X="4" INDEX_Y="0">발급여부</OZTTLABEL>
      <OZTTLABEL NAME="라벨14" LEFT="381.25983" WIDTH="170.74017" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="TAXSTMTKIND" BGCOLOR="-3355393" INDEX_X="5" INDEX_Y="0">담당자/비고</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨15" TOP="14.173225" WIDTH="112.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_TAXSTMTISSU" DATASETNAME="SET_ov_curcommlist" COLNAME="RDR_NO" INDEX_X="0" INDEX_Y="1">RDR_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨16" LEFT="112.0" TOP="14.173225" WIDTH="72.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_TAXSTMTISSU" DATASETNAME="SET_ov_curcommlist" COLNAME="RDRNM" WORDWRAP="true" INDEX_X="1" INDEX_Y="1">RDRNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨17" LEFT="184.0" TOP="14.173225" WIDTH="64.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_TAXSTMTISSU" DATASETNAME="SET_ov_curcommlist" COLNAME="MEDINM" WORDWRAP="true" INDEX_X="2" INDEX_Y="1">MEDINM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨18" LEFT="248.0" TOP="14.173225" WIDTH="72.0" HEIGHT="14.173229" SCRIPTCODE="if(strlen(#SP_PB_P_TAXSTMTISSU.SET_ov_curcommlist.TAXSTMTISSUDT#) != 8) {~OZ#CRLFsetattr(&quot;caption&quot;,&quot;&quot;);~OZ#CRLF} else {~OZ#CRLFsetattr(&quot;caption&quot;,substr(#SP_PB_P_TAXSTMTISSU.SET_ov_curcommlist.TAXSTMTISSUDT#,0,4)+&quot;/&quot;+substr(#SP_PB_P_TAXSTMTISSU.SET_ov_curcommlist.TAXSTMTISSUDT#,4,2)+&quot;/&quot;+substr(#SP_PB_P_TAXSTMTISSU.SET_ov_curcommlist.TAXSTMTISSUDT#,6,2));~OZ#CRLF}" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_TAXSTMTISSU" DATASETNAME="SET_ov_curcommlist" COLNAME="TAXSTMTISSUDT" INDEX_X="3" INDEX_Y="1">TAXSTMTISSUDT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨19" LEFT="320.0" TOP="14.173225" WIDTH="61.259827" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_TAXSTMTISSU" DATASETNAME="SET_ov_curcommlist" COLNAME="TAXSTMTEXNENM" INDEX_X="4" INDEX_Y="1">TAXSTMTEXNENM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨20" LEFT="381.25983" TOP="14.173225" WIDTH="170.74017" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_TAXSTMTISSU" DATASETNAME="SET_ov_curcommlist" COLNAME="TAXSTMTKIND" WORDWRAP="true" INDEX_X="5" INDEX_Y="1">TAXSTMTKIND</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZBAND NAME="써머리 밴드1" TOP="119.17323" WIDTH="554.7402" HEIGHT="240.82677" BANDTYPE="8" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" IGNORENEWPAGE="false">
    <OZTable NAME="테이블2" LEFT="304.0" TOP="8.826767" WIDTH="242.51965" HEIGHT="28.346447" ODINAME="SP_PB_P_TAXSTMTISSU" DATASET="SET_ov_medicur" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="false" SELLABEL="MEDINM#%$oz*&amp;^TAXSTMTEXNENM#%$oz*&amp;^CNT" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="false">
      <OZTTLABEL NAME="라벨23" WIDTH="85.25983" HEIGHT="14.173218" PAINTALLOW="1" COLNAME="MEDINM" BGCOLOR="-3355393" INDEX_X="0" INDEX_Y="0">매체명</OZTTLABEL>
      <OZTTLABEL NAME="라벨22" LEFT="85.25983" WIDTH="80.0" HEIGHT="14.173218" PAINTALLOW="1" COLNAME="TAXSTMTEXNENM" BGCOLOR="-3355393" INDEX_X="1" INDEX_Y="0">발급여부</OZTTLABEL>
      <OZTTLABEL NAME="라벨24" LEFT="165.25983" WIDTH="77.25983" HEIGHT="14.173218" PAINTALLOW="1" COLNAME="CNT" BGCOLOR="-3355393" INDEX_X="2" INDEX_Y="0">부수</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨26" TOP="14.173218" WIDTH="85.25983" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_TAXSTMTISSU" DATASETNAME="SET_ov_medicur" COLNAME="MEDINM" INDEX_X="0" INDEX_Y="1">MEDINM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨25" LEFT="85.25983" TOP="14.173218" WIDTH="80.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_TAXSTMTISSU" DATASETNAME="SET_ov_medicur" COLNAME="TAXSTMTEXNENM" INDEX_X="1" INDEX_Y="1">TAXSTMTEXNENM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨27" LEFT="165.25983" TOP="14.173218" WIDTH="77.25983" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_TAXSTMTISSU" DATASETNAME="SET_ov_medicur" COLNAME="CNT" INDEX_X="2" INDEX_Y="1">CNT</OZGROUPLABEL>
    </OZTable>
  </OZBAND>
  <OZBACKBAND NAME="배경1" WIDTH="554.7402" HEIGHT="791.7165" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_TAXSTMTISSU" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_TAXSTMTISSU.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_TAXSTMTISSU" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_curcommlist" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_medicur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="iv_incmgpers" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="iv_procdt" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_taxstmtissudtbgn" VALUE="20040404" />
	<PARAMFIELD FIELDNAME="iv_taxstmtissudtend" VALUE="20040408" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

