OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="false" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="841.88983" PAPERHEIGHT="594.9921" SCRIPTBCE="false" VIRTUALX="0.95550627" VIRTUALY="0.95550627" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1091092984312" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="801.6379" HEIGHT="544.8189" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="더미 밴드2#%$oz*&amp;^데이터 밴드1" SRC="" />
  <OZBAND NAME="타이틀 밴드2" WIDTH="801.6379" HEIGHT="28.0" BANDTYPE="2" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨1" WIDTH="801.6379" HEIGHT="28.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="14" FONTNAME="굴림체" FONTSTYLE="1">사 원 별 연 명 부</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="더미 밴드2" TOP="28.0" WIDTH="801.6379" HEIGHT="48.17323" SCRIPTCODE="if (totalRowCount ( &quot;SP_PB_P_PRT_RDR_EMP.SET_ORAProc&quot; ) == 0 ) {~OZ#CRLF    setattr (&quot;visable&quot;,&quot;true&quot;); ~OZ#CRLF}else{ ~OZ#CRLF    setattr (&quot;visable&quot;,&quot;false&quot;); ~OZ#CRLF}~OZ#CRLF//write(totalRowCount ( &quot;SP_PB_P_PRT_RDR_YEAR.SET_LIST&quot;));" BANDTYPE="10" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="17" REPEATNUM="1" PAGEENDSTOP="false">
    <ONESHAPE NAME="라벨3" LEFT="28.0" TOP="33.0" WIDTH="153.62106" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림">독자번호</ONESHAPE>
    <ONESHAPE NAME="라벨4" LEFT="182.0" TOP="33.0" WIDTH="46.36212" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림">독자명</ONESHAPE>
    <ONESHAPE NAME="라벨5" LEFT="227.99998" TOP="33.0" WIDTH="91.00002" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림">구독기간</ONESHAPE>
    <ONESHAPE NAME="라벨6" LEFT="319.0" TOP="33.0" WIDTH="41.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림">우편번호</ONESHAPE>
    <ONESHAPE NAME="라벨7" LEFT="360.0" TOP="33.0" WIDTH="216.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림">주 소</ONESHAPE>
    <ONESHAPE NAME="라벨8" LEFT="664.0" TOP="33.0" WIDTH="136.27582" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림">직장명</ONESHAPE>
    <ONESHAPE NAME="라벨9" LEFT="576.0" TOP="33.0" WIDTH="88.0" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림">발송방법</ONESHAPE>
    <ONESHAPE NAME="라벨12" LEFT="736.6379" TOP="7.0" WIDTH="65.0" HEIGHT="16.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림">0  /  0</ONESHAPE>
    <ONESHAPE NAME="라벨13" TOP="33.0" WIDTH="28.346457" HEIGHT="15.173229" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림">순번</ONESHAPE>
    <ONESHAPE NAME="라벨2" TOP="13.0" WIDTH="47.0" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">신청기간 : </ONESHAPE>
    <ONESHAPE NAME="라벨30" LEFT="56.0" TOP="13.0" WIDTH="47.0" HEIGHT="14.173228" SCRIPTCODE="string fdate;~OZ#CRLFfdate =  #SP_PB_P_PRT_RDR_EMP.OZParam.iv_aplcdf#;~OZ#CRLFsetattr(&quot;caption&quot;, fdate);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2"> </ONESHAPE>
    <ONESHAPE NAME="라벨31" LEFT="120.0" TOP="13.0" WIDTH="47.0" HEIGHT="14.173228" SCRIPTCODE="string tdate;~OZ#CRLFtdate = #SP_PB_P_PRT_RDR_EMP.OZParam.iv_aplcdt#;~OZ#CRLFsetattr(&quot;caption&quot;, tdate);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨32" LEFT="104.0" TOP="13.0" WIDTH="13.0" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="9" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">~</ONESHAPE>
    <ONESHAPE NAME="라벨33" LEFT="288.0" TOP="13.0" WIDTH="44.0" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">구독매채 : </ONESHAPE>
    <ONESHAPE NAME="라벨34" LEFT="336.0" TOP="13.0" WIDTH="105.0" HEIGHT="14.173228" SCRIPTCODE="string str;~OZ#CRLFstr =#SP_PB_P_PRT_RDR_EMP.SET_SP_PB_P_PRT_RDR_EMP.ov_medinm#;~OZ#CRLFsetattr(&quot;caption&quot;, str);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨35" LEFT="232.0" TOP="13.0" WIDTH="47.0" HEIGHT="14.173228" SCRIPTCODE="string str ;~OZ#CRLFstr = #SP_PB_P_PRT_RDR_EMP.SET_SP_PB_P_PRT_RDR_EMP.ov_boempnm#;~OZ#CRLFsetattr(&quot;caption&quot;, str);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0"></ONESHAPE>
    <ONESHAPE NAME="라벨44" LEFT="176.0" TOP="13.0" WIDTH="47.0" HEIGHT="14.173228" SCRIPTCODE="string tdate;~OZ#CRLFtdate =#SP_PB_P_PRT_RDR_EMP.SET_SP_PB_P_PRT_RDR_EMP.ov_deptnm#;~OZ#CRLFsetattr(&quot;caption&quot;, tdate+&quot; : &quot;);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="76.17323" WIDTH="801.6379" HEIGHT="27.826767" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="12" ODINAME="SP_PB_P_PRT_RDR_EMP" MASTER="리포트1" DATASOURCENAME="Shadow_Key" SUBDATALIST="데이터 밴드2" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨45" LEFT="8.0" TOP="4.0" WIDTH="47.0" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">신청기간 : </ONESHAPE>
    <ONESHAPE NAME="라벨46" LEFT="64.0" TOP="4.0" WIDTH="47.0" HEIGHT="14.173228" SCRIPTCODE="string fdate;~OZ#CRLFfdate =  #SP_PB_P_PRT_RDR_EMP.OZParam.iv_aplcdf#;~OZ#CRLFsetattr(&quot;caption&quot;, fdate);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2"> </ONESHAPE>
    <ONESHAPE NAME="라벨47" LEFT="128.0" TOP="4.0" WIDTH="47.0" HEIGHT="14.173228" SCRIPTCODE="string tdate;~OZ#CRLFtdate = #SP_PB_P_PRT_RDR_EMP.OZParam.iv_aplcdt#;~OZ#CRLFsetattr(&quot;caption&quot;, tdate);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨48" LEFT="112.0" TOP="4.0" WIDTH="13.0" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">~</ONESHAPE>
    <ONESHAPE NAME="라벨49" LEFT="296.0" TOP="4.0" WIDTH="44.0" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">구독매채 : </ONESHAPE>
    <ONESHAPE NAME="라벨50" LEFT="344.0" TOP="4.0" WIDTH="105.0" HEIGHT="14.173228" SCRIPTCODE="string str;~OZ#CRLFstr =#SP_PB_P_PRT_RDR_EMP.SET_SP_PB_P_PRT_RDR_EMP.ov_medinm#;~OZ#CRLFsetattr(&quot;caption&quot;, str);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨51" LEFT="240.0" TOP="4.0" WIDTH="47.0" HEIGHT="14.173228" SCRIPTCODE="string str ;~OZ#CRLFstr = #SP_PB_P_PRT_RDR_EMP.SET_SP_PB_P_PRT_RDR_EMP.ov_empkubun#;~OZ#CRLFsetattr(&quot;caption&quot;, str);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0"></ONESHAPE>
    <ONESHAPE NAME="라벨52" LEFT="184.0" TOP="4.0" WIDTH="47.0" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1">사원구분 :</ONESHAPE>
    <ONESHAPE NAME="라벨53" LEFT="760.0" TOP="4.0" WIDTH="40.0" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨54" LEFT="720.0" TOP="4.0" WIDTH="40.0" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;,#OZSystem.Page_Number#+&quot;  / &quot;);" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨55" LEFT="480.0" TOP="4.0" WIDTH="80.0" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Key" COLNAME="EMPNM" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체">&lt;Shadow_Key:EMPNM&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨56" LEFT="560.0" TOP="4.0" WIDTH="64.0" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Key" COLNAME="EMPNO" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체">&lt;Shadow_Key:EMPNO&gt;</ONESHAPE>
  </OZDATABAND>
  <OZDATABAND NAME="데이터 밴드2" TOP="104.0" WIDTH="801.6379" HEIGHT="56.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="true" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_PRT_RDR_EMP" MASTER="데이터 밴드1" DATASOURCENAME="Shadow_Detail" SUBDATALIST="" FIXEDTITLE="true" FIXEDMASTER="true" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블1" WIDTH="800.0" HEIGHT="28.346457" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASET="Shadow_Detail" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="true" SELLABEL="RDR_NO#%$oz*&amp;^RDR_NM#%$oz*&amp;^SUBSSER_NO#%$oz*&amp;^DLVZIP#%$oz*&amp;^DLVADDR#%$oz*&amp;^SENDMTHD#%$oz*&amp;^RDROFFINM" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="false">
      <OZTTLABEL NAME="라벨10" WIDTH="31.724243" HEIGHT="14.173228" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="0">순번</OZTTLABEL>
      <OZTTLABEL NAME="라벨11" LEFT="31.724243" WIDTH="104.27576" HEIGHT="14.173228" PAINTALLOW="1" COLNAME="RDR_NO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="0">독자번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨14" LEFT="136.0" WIDTH="128.0" HEIGHT="14.173228" PAINTALLOW="1" COLNAME="RDR_NM" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="0">독자명/수취인</OZTTLABEL>
      <OZTTLABEL NAME="라벨15" LEFT="264.0" WIDTH="80.0" HEIGHT="14.173228" PAINTALLOW="1" COLNAME="SUBSSER_NO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="0">구독기간</OZTTLABEL>
      <OZTTLABEL NAME="라벨16" LEFT="344.0" WIDTH="40.0" HEIGHT="14.173228" PAINTALLOW="1" COLNAME="DLVZIP" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="0">우편번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨17" LEFT="384.0" WIDTH="256.0" HEIGHT="14.173228" PAINTALLOW="1" COLNAME="DLVADDR" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="0">주 소</OZTTLABEL>
      <OZTTLABEL NAME="라벨18" LEFT="640.0" WIDTH="48.0" HEIGHT="14.173228" PAINTALLOW="1" COLNAME="SENDMTHD" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="6" INDEX_Y="0">발송방법</OZTTLABEL>
      <OZTTLABEL NAME="라벨19" LEFT="688.0" WIDTH="112.0" HEIGHT="14.173228" PAINTALLOW="1" COLNAME="RDROFFINM" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="7" INDEX_Y="0">직장명</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨20" TOP="14.173228" WIDTH="31.724243" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Detail" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="1"></OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨21" LEFT="31.724243" TOP="14.173228" WIDTH="104.27576" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Detail" COLNAME="RDR_NO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="1">RDR_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨22" LEFT="136.0" TOP="14.173228" WIDTH="128.0" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Detail" COLNAME="RDR_NM" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="1">RDR_NM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨23" LEFT="264.0" TOP="14.173228" WIDTH="80.0" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Detail" COLNAME="SUBSSER_NO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="1">SUBSSER_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨24" LEFT="344.0" TOP="14.173228" WIDTH="40.0" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Detail" COLNAME="DLVZIP" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="1">DLVZIP</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨25" LEFT="384.0" TOP="14.173228" WIDTH="256.0" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Detail" COLNAME="DLVADDR" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" INDEX_X="5" INDEX_Y="1">DLVADDR</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨26" LEFT="640.0" TOP="14.173228" WIDTH="48.0" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Detail" COLNAME="SENDMTHD" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="6" INDEX_Y="1">SENDMTHD</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨27" LEFT="688.0" TOP="14.173228" WIDTH="112.0" HEIGHT="14.173228" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_PRT_RDR_EMP" DATASETNAME="Shadow_Detail" COLNAME="RDROFFINM" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="7" INDEX_Y="1">RDROFFINM</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZBACKBAND NAME="배경1" WIDTH="801.6379" HEIGHT="544.8189" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
    <OZFONTFAMILY NAME="굴림" FONTFAMILY="Gulim" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_PRT_RDR_EMP" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_PRT_RDR_EMP.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_PRT_RDR_EMP" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ORAProc" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_Key" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_Detail" MASTERSET="Shadow_Key" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="iv_bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="iv_incmgpers" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_medicd" VALUE="230" />
	<PARAMFIELD FIELDNAME="iv_boemp" VALUE="AMNO" />
	<PARAMFIELD FIELDNAME="iv_aplcdf" VALUE="20040701" />
	<PARAMFIELD FIELDNAME="iv_aplcdt" VALUE="20040715" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

