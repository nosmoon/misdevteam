OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="30.0" LEFTMARGIN="20.0" BOTTOMMARGIN="20.0" RIGHTMARGIN="20.0" PAPERSIZE="1" PAPERWIDTH="595.0" PAPERHEIGHT="842.0" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="false" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1086175134468" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="8" FONTNAME="굴림" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="555.0" HEIGHT="792.0" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드1" SRC="" />
  <OZDATABAND NAME="데이터 밴드1" WIDTH="555.0" HEIGHT="360.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_SL_P_RDREXTN_STATS" MASTER="리포트1" DATASOURCENAME="SET_List" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZCHART NAME="차트1" LEFT="8.0" TOP="8.0" WIDTH="536.0" HEIGHT="336.0" FillBackground="false" showXMainTick="false" showXSubTick="false" showYSubTick="false" TITLE="직원별확장부수" xItemTitle="확장자명" ySeriesTitle="확장부수" maxRowsNum="10" STYLE="202" DATASETNAME="SET_List" ODINAME="SP_SL_P_RDREXTN_STATS" xItemField="확장자" valueField="중지#%$oz*&amp;^확장" valueOption="non#%$oz*&amp;^non" customStyle="0" xSubTickType="4" barThick="20.0">
      <CHARTLABEL NAME="" WIDTH="105.0" HEIGHT="19.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="15" FONTNAME="굴림" CHARTLABELTYPE="0">직원별확장부수</CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="2.0" HEIGHT="2.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="1"></CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="40.0" HEIGHT="13.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="2">확장자명</CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="2.0" HEIGHT="2.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="3"></CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="40.0" HEIGHT="13.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="4">확장부수</CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="2.0" HEIGHT="2.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="5"></CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="2.0" HEIGHT="2.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="6"></CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="2.0" HEIGHT="2.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" CHARTLABELTYPE="7">Pattern error!</CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="7.0" HEIGHT="13.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="8">A</CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="2.0" HEIGHT="2.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="9"></CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="2.0" HEIGHT="2.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="10"></CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="2.0" HEIGHT="2.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" CHARTLABELTYPE="11"></CHARTLABEL>
      <CHARTLABEL NAME="" WIDTH="2.0" HEIGHT="2.0" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" FORMAT_OPTION="normal#NA" CHARTLABELTYPE="12"></CHARTLABEL>
    </OZCHART>
  </OZDATABAND>
  <OZBACKBAND NAME="배경1" WIDTH="555.0" HEIGHT="792.0" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림" FONTFAMILY="Gulim" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_SL_P_RDREXTN_STATS" GROUP="/" CATEGORY="/" ODINAME="SP_SL_P_RDREXTN_STATS.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_sp_sl_p_rdrextn_stats" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_List" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="iv_bocd" VALUE="19110" />
	<PARAMFIELD FIELDNAME="iv_medicd" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_frdst" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_todst" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_teamcd" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_frextndt" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_toextndt" VALUE="" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

