OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="30.0" LEFTMARGIN="20.0" BOTTOMMARGIN="20.0" RIGHTMARGIN="20.0" PAPERSIZE="1" PAPERWIDTH="595.0" PAPERHEIGHT="842.0" SCRIPTBCE="false" VIRTUALX="1.1802651" VIRTUALY="1.1802651" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1091523698729" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="555.0" HEIGHT="792.0" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드2" SRC="" />
  <OZDATABAND NAME="데이터 밴드2" WIDTH="555.0" HEIGHT="94.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="9" ODINAME="SP_PB_P_ENPR_INCM_PAY" MASTER="리포트1" DATASOURCENAME="Shadow_key" SUBDATALIST="데이터 밴드1" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨17" TOP="70.0" WIDTH="555.0" HEIGHT="17.0" SCRIPTCODE="setattr(&quot;caption&quot;, &quot;성명:&quot;+#SP_PB_P_ENPR_INCM_PAY.Shadow_key.FLNM#~OZ#CRLF                           +&quot;     주민번호:&quot;+#SP_PB_P_ENPR_INCM_PAY.Shadow_key.PRN#~OZ#CRLF                           +&quot;     주소:&quot;+#SP_PB_P_ENPR_INCM_PAY.Shadow_key.DLVADDR#);" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨16" WIDTH="552.0" HEIGHT="24.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="14" FONTSTYLE="1">사업소득 지급조서</ONESHAPE>
    <ONESHAPE NAME="라벨18" LEFT="216.0" TOP="30.0" WIDTH="120.0" HEIGHT="22.0" SCRIPTCODE="setattr(&quot;caption&quot;, &quot;&lt; 해당년도 : &quot;+#SP_PB_P_ENPR_INCM_PAY.OZParam.closyy#+&quot; &gt;&quot;);" PAINTALLOW="1" FONTSIZE="10" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0"></ONESHAPE>
    <ONESHAPE NAME="라벨19" LEFT="480.0" TOP="30.0" WIDTH="48.0" HEIGHT="16.0" SCRIPTCODE="setattr(&quot;caption&quot;, #SP_PB_P_ENPR_INCM_PAY.SET_SP_PB_P_ENPR_INCM_PAY.ov_sysdate#);" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true"></ONESHAPE>
    <ONESHAPE NAME="라벨20" LEFT="480.0" TOP="46.0" WIDTH="16.0" HEIGHT="16.0" SCRIPTCODE="setattr(&quot;caption&quot;,#OZSystem.Page_Number#);" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" FORMAT_OPTION="normal#none" NOFRAME="true" FONTNAME="굴림체">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨21" LEFT="512.0" TOP="46.0" WIDTH="16.0" HEIGHT="16.0" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" FORMAT_OPTION="normal#none" NOFRAME="true" FONTNAME="굴림체">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨22" LEFT="496.0" TOP="46.0" WIDTH="16.0" HEIGHT="16.0" PAINTALLOW="1" NOFRAME="true">/</ONESHAPE>
    <ONESHAPE NAME="라벨28" LEFT="440.0" TOP="30.0" WIDTH="40.0" HEIGHT="16.0" PAINTALLOW="1" NOFRAME="true">출력일자</ONESHAPE>
    <ONESHAPE NAME="라벨29" LEFT="440.0" TOP="46.0" WIDTH="40.0" HEIGHT="16.0" PAINTALLOW="1" NOFRAME="true">페이지</ONESHAPE>
  </OZDATABAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="94.0" WIDTH="555.0" HEIGHT="34.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="데이터 풋터밴드1" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" MASTER="데이터 밴드2" DATASOURCENAME="Shadow_data" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블1" WIDTH="552.0" HEIGHT="34.0" ODINAME="SP_PB_P_ENPR_INCM_PAY" DATASET="Shadow_data" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="false" SELLABEL="PAYDT#%$oz*&amp;^CLOSMM#%$oz*&amp;^ALONPAYTOT_AMT#%$oz*&amp;^INCM_TAX#%$oz*&amp;^PRN_TAX#%$oz*&amp;^TOT_TAX" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="true">
      <OZTTLABEL NAME="라벨4" WIDTH="96.0" HEIGHT="18.0" PAINTALLOW="1" COLNAME="PAYDT" BGCOLOR="-3355393" INDEX_X="0" INDEX_Y="0">지급일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨5" LEFT="96.0" WIDTH="88.0" HEIGHT="18.0" PAINTALLOW="1" COLNAME="CLOSMM" BGCOLOR="-3355393" INDEX_X="1" INDEX_Y="0">마감월</OZTTLABEL>
      <OZTTLABEL NAME="라벨6" LEFT="184.0" WIDTH="88.0" HEIGHT="18.0" PAINTALLOW="1" COLNAME="ALONPAYTOT_AMT" BGCOLOR="-3355393" INDEX_X="2" INDEX_Y="0">지급총액</OZTTLABEL>
      <OZTTLABEL NAME="라벨7" LEFT="272.0" WIDTH="96.0" HEIGHT="18.0" PAINTALLOW="1" COLNAME="INCM_TAX" BGCOLOR="-3355393" INDEX_X="3" INDEX_Y="0">소득세</OZTTLABEL>
      <OZTTLABEL NAME="라벨8" LEFT="368.0" WIDTH="88.0" HEIGHT="18.0" PAINTALLOW="1" COLNAME="PRN_TAX" BGCOLOR="-3355393" INDEX_X="4" INDEX_Y="0">주민세</OZTTLABEL>
      <OZTTLABEL NAME="라벨9" LEFT="456.0" WIDTH="96.0" HEIGHT="18.0" PAINTALLOW="1" COLNAME="TOT_TAX" BGCOLOR="-3355393" INDEX_X="5" INDEX_Y="0">계</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨10" TOP="18.0" WIDTH="96.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" DATASETNAME="Shadow_data" COLNAME="PAYDT" INDEX_X="0" INDEX_Y="1">PAYDT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨11" LEFT="96.0" TOP="18.0" WIDTH="88.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" DATASETNAME="Shadow_data" COLNAME="CLOSMM" INDEX_X="1" INDEX_Y="1">CLOSMM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨12" LEFT="184.0" TOP="18.0" WIDTH="88.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" DATASETNAME="Shadow_data" COLNAME="ALONPAYTOT_AMT" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" HALIGN="2" INDEX_X="2" INDEX_Y="1">ALONPAYTOT_AMT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨13" LEFT="272.0" TOP="18.0" WIDTH="96.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" DATASETNAME="Shadow_data" COLNAME="INCM_TAX" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" HALIGN="2" INDEX_X="3" INDEX_Y="1">INCM_TAX</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨14" LEFT="368.0" TOP="18.0" WIDTH="88.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" DATASETNAME="Shadow_data" COLNAME="PRN_TAX" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" HALIGN="2" INDEX_X="4" INDEX_Y="1">PRN_TAX</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨15" LEFT="456.0" TOP="18.0" WIDTH="96.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" DATASETNAME="Shadow_data" COLNAME="TOT_TAX" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" HALIGN="2" INDEX_X="5" INDEX_Y="1">TOT_TAX</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZBAND NAME="데이터 풋터밴드1" TOP="128.0" WIDTH="555.0" HEIGHT="21.653534" BANDTYPE="7" PARENT="데이터 밴드1" FORCENEWPAGE="true" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <OZTABLESTATIC NAME="고정 테이블1" TOP="5.653534" WIDTH="552.0" HEIGHT="16.0">
      <OZTABLELABEL NAME="라벨1" WIDTH="184.0" HEIGHT="16.0" PAINTALLOW="1" BGCOLOR="-3355393" LEFT="0.0" TOP="5.653534" INDEX_X="0" INDEX_Y="0" INDEX_W="1" INDEX_H="1">합 계</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨2" LEFT="184.0" WIDTH="88.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" EXP="Shadow_data.ALONPAYTOT_AMT.sum" HALIGN="2" TOP="5.653534" INDEX_X="1" INDEX_Y="0" INDEX_W="1" INDEX_H="1">Shadow_data.ALONPAYTOT_AMT.sum</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨3" LEFT="272.0" WIDTH="96.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" EXP="Shadow_data.INCM_TAX.sum" HALIGN="2" TOP="5.653534" INDEX_X="2" INDEX_Y="0" INDEX_W="1" INDEX_H="1">Shadow_data.INCM_TAX.sum</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨30" LEFT="368.0" WIDTH="88.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" EXP="Shadow_data.PRN_TAX.sum" HALIGN="2" TOP="5.653534" INDEX_X="3" INDEX_Y="0" INDEX_W="1" INDEX_H="1">Shadow_data.PRN_TAX.sum</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨31" LEFT="456.0" WIDTH="96.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_ENPR_INCM_PAY" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" EXP="Shadow_data.TOT_TAX.sum" HALIGN="2" TOP="5.653534" INDEX_X="4" INDEX_Y="0" INDEX_W="1" INDEX_H="1">Shadow_data.TOT_TAX.sum</OZTABLELABEL>
    </OZTABLESTATIC>
  </OZBAND>
  <OZBACKBAND NAME="배경1" WIDTH="555.0" HEIGHT="792.0" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_ENPR_INCM_PAY" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_ENPR_INCM_PAY.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_ENPR_INCM_PAY" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_enprpaycur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_key" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_data" MASTERSET="Shadow_key" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="closyy" VALUE="2004" />
	<PARAMFIELD FIELDNAME="kubun" VALUE="BRCH" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

