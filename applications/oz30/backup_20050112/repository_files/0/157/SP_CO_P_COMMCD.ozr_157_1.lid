OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="594.9921" PAPERHEIGHT="841.88983" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1086157532484" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="554.7402" HEIGHT="791.7166" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="더미 밴드1#%$oz*&amp;^데이터 밴드1" SRC="" />
  <OZBAND NAME="타이틀 밴드1" WIDTH="554.7402" HEIGHT="28.0" BANDTYPE="2" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨1" WIDTH="554.7401" HEIGHT="28.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="12" FONTSTYLE="1">부서 코드 리스트</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="더미 밴드1" TOP="28.0" WIDTH="554.7402" HEIGHT="53.0" SCRIPTCODE="if (totalRowCount ( &quot;SP_CO_P_COMMCD.SET_ov_curcommlist&quot; ) == 0 ) {~OZ#CRLF    setattr (&quot;visable&quot;,&quot;true&quot;); ~OZ#CRLF}else{ ~OZ#CRLF    setattr (&quot;visable&quot;,&quot;false&quot;); ~OZ#CRLF}" BANDTYPE="10" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" REPEATNUM="0" PAGEENDSTOP="false">
    <OZTABLESTATIC NAME="고정 테이블1" TOP="29.000004" WIDTH="553.6063" HEIGHT="14.173228">
      <OZTABLELABEL NAME="라벨2" WIDTH="70.86615" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" LEFT="0.0" TOP="29.000004" INDEX_X="0" INDEX_Y="0" INDEX_W="1" INDEX_H="1">부서코드</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨3" LEFT="70.86615" WIDTH="79.37007" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="29.000004" INDEX_X="1" INDEX_Y="0" INDEX_W="1" INDEX_H="1">부서명</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨4" LEFT="150.23622" WIDTH="247.74803" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="29.000004" INDEX_X="2" INDEX_Y="0" INDEX_W="1" INDEX_H="1">비고</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨5" LEFT="397.98425" WIDTH="51.874023" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="29.000004" INDEX_X="3" INDEX_Y="0" INDEX_W="1" INDEX_H="1">등록일자</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨6" LEFT="449.85828" WIDTH="51.874023" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="29.000004" INDEX_X="4" INDEX_Y="0" INDEX_W="1" INDEX_H="1">해지일자</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨7" LEFT="501.7323" WIDTH="51.874023" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" TOP="29.000004" INDEX_X="5" INDEX_Y="0" INDEX_W="1" INDEX_H="1">입력자</OZTABLELABEL>
    </OZTABLESTATIC>
  </OZBAND>
  <OZBAND NAME="데이터 헤더밴드1" TOP="81.0" WIDTH="554.7402" HEIGHT="31.0" BANDTYPE="5" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨20" TOP="4.0" WIDTH="208.0" HEIGHT="24.0" SCRIPTCODE="if(#SP_CO_P_COMMCD.OZParam.iv_cdval#  !=&quot;&quot;)  {~OZ#CRLFsetattr(&quot;caption&quot;,&quot;부서코드 : &quot;+#SP_CO_P_COMMCD.OZParam.iv_cdval# );~OZ#CRLF} else  if(#SP_CO_P_COMMCD.OZParam.iv_cdnm# !=&quot;&quot;) {~OZ#CRLFsetattr(&quot;caption&quot;,&quot;부서명 : &quot;+#SP_CO_P_COMMCD.OZParam.iv_cdnm#);~OZ#CRLF}~OZ#CRLF" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" HALIGN="1"></ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="112.0" WIDTH="554.7402" HEIGHT="72.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="데이터 헤더밴드1" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_CO_P_COMMCD" MASTER="리포트1" DATASOURCENAME="SET_ov_curcommlist" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블1" WIDTH="553.874" HEIGHT="28.346455" ODINAME="SP_CO_P_COMMCD" DATASET="SET_ov_curcommlist" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="false" SELLABEL="CDVAL#%$oz*&amp;^CDNM#%$oz*&amp;^REMK#%$oz*&amp;^INCMGDT#%$oz*&amp;^MANGITEM1#%$oz*&amp;^INCMGPERS" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="true">
      <OZTTLABEL NAME="라벨8" WIDTH="70.86615" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="CDVAL" BGCOLOR="-3355393" INDEX_X="0" INDEX_Y="0">부서코드</OZTTLABEL>
      <OZTTLABEL NAME="라벨9" LEFT="70.86615" WIDTH="79.370056" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="CDNM" BGCOLOR="-3355393" INDEX_X="1" INDEX_Y="0">부서명</OZTTLABEL>
      <OZTTLABEL NAME="라벨10" LEFT="150.2362" WIDTH="247.7638" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="REMK" BGCOLOR="-3355393" INDEX_X="2" INDEX_Y="0">비고</OZTTLABEL>
      <OZTTLABEL NAME="라벨11" LEFT="398.0" WIDTH="52.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="INCMGDT" BGCOLOR="-3355393" INDEX_X="3" INDEX_Y="0">등록일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨12" LEFT="450.0" WIDTH="52.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="MANGITEM1" BGCOLOR="-3355393" INDEX_X="4" INDEX_Y="0">해지일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨13" LEFT="502.0" WIDTH="51.874023" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="INCMGPERS" BGCOLOR="-3355393" INDEX_X="5" INDEX_Y="0">입력자</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨14" TOP="14.173225" WIDTH="70.86615" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_CO_P_COMMCD" DATASETNAME="SET_ov_curcommlist" COLNAME="CDVAL" HALIGN="1" WORDWRAP="true" INDEX_X="0" INDEX_Y="1">CDVAL</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨15" LEFT="70.86615" TOP="14.173225" WIDTH="79.370056" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_CO_P_COMMCD" DATASETNAME="SET_ov_curcommlist" COLNAME="CDNM" HALIGN="1" WORDWRAP="true" INDEX_X="1" INDEX_Y="1">CDNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨16" LEFT="150.2362" TOP="14.173225" WIDTH="247.7638" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_CO_P_COMMCD" DATASETNAME="SET_ov_curcommlist" COLNAME="REMK" HALIGN="1" WORDWRAP="true" INDEX_X="2" INDEX_Y="1">REMK</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨17" LEFT="398.0" TOP="14.173225" WIDTH="52.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_CO_P_COMMCD" DATASETNAME="SET_ov_curcommlist" COLNAME="INCMGDT" INDEX_X="3" INDEX_Y="1">INCMGDT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨18" LEFT="450.0" TOP="14.173225" WIDTH="52.0" HEIGHT="14.173229" SCRIPTCODE="if(#SP_CO_P_COMMCD.SET_ov_curcommlist.MANGITEM1#==&quot;//&quot;) {~OZ#CRLF    setattr(&quot;caption&quot;,&quot;&quot;);~OZ#CRLF} else {~OZ#CRLF    setattr(&quot;caption&quot;,#SP_CO_P_COMMCD.SET_ov_curcommlist.MANGITEM1#);~OZ#CRLF}" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_CO_P_COMMCD" DATASETNAME="SET_ov_curcommlist" COLNAME="MANGITEM1" INDEX_X="4" INDEX_Y="1">MANGITEM1</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨19" LEFT="502.0" TOP="14.173225" WIDTH="51.874023" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_CO_P_COMMCD" DATASETNAME="SET_ov_curcommlist" COLNAME="INCMGPERS" INDEX_X="5" INDEX_Y="1">INCMGPERS</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZBACKBAND NAME="배경1" WIDTH="554.7402" HEIGHT="791.7166" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_CO_P_COMMCD" GROUP="/" CATEGORY="/" ODINAME="SP_CO_P_COMMCD.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_CO_P_COMMCD" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_curcommlist" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="iv_bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="iv_cdclsf" VALUE="20" />
	<PARAMFIELD FIELDNAME="iv_cdval" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_cdnm" VALUE="" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

