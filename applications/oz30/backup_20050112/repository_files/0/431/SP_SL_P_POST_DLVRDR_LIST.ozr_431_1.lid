OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="0.0" LEFTMARGIN="36.850395" BOTTOMMARGIN="396.28345" RIGHTMARGIN="36.850395" PAPERSIZE="2" PAPERWIDTH="841.88983" PAPERHEIGHT="1191.1182" SCRIPTBCE="false" VIRTUALX="0.8147998" VIRTUALY="0.8147998" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1102906652129" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="true" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="768.189" HEIGHT="794.8347" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드2" SRC="" />
  <OZDATABAND NAME="데이터 밴드2" WIDTH="768.189" HEIGHT="263.62207" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_SL_P_POST_DLVRDR_LIST" MASTER="리포트1" DATASOURCENAME="SET_ov_rdrlistcur" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZREGION NAME="리전1" WIDTH="384.09448" HEIGHT="263.62207" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드1" SRC="" BINDTYPE="5" HGAP="0.0" VGAP="0.0">
      <OZDATABAND NAME="데이터 밴드1" WIDTH="384.09448" HEIGHT="263.62207" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="6" ODINAME="SP_SL_P_POST_DLVRDR_LIST" MASTER="리전1" DATASOURCENAME="SET_ov_rdrlistcur" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
	<ONESHAPE NAME="라벨2" LEFT="221.25197" TOP="200.4252" WIDTH="51.023624" HEIGHT="24.09449" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_POST_DLVRDR_LIST" DATASETNAME="SET_ov_rdrlistcur" COLNAME="ZIP1" FORMAT_OPTION="normal#none" FONTSIZE="11" SPACING="13.0">&lt;SET_ov_rdrlistcur:ZIP1&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨6" LEFT="300.47244" TOP="30.346458" WIDTH="32.0" HEIGHT="24.0" SCRIPTCODE="if(strcmp(#OZFormParam.uv_po_print#,&quot;1&quot;)){~OZ#CRLF    setattr(&quot;caption&quot;, #SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.POST_OFFNM#);~OZ#CRLF}else{~OZ#CRLF    setattr(&quot;caption&quot;, &quot;&quot;);~OZ#CRLF}" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_POST_DLVRDR_LIST" DATASETNAME="SET_ov_rdrlistcur" COLNAME="POST_OFFNM">&lt;SET_ov_rdrlistcur:POST_OFFNM&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨7" LEFT="28.346458" TOP="30.346458" WIDTH="80.0" HEIGHT="24.0" SCRIPTCODE="string str;~OZ#CRLF~OZ#CRLFstr = #SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.MEDINM#+&quot;(&quot;+#SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.BONM# + &quot;)&quot;;~OZ#CRLF~OZ#CRLFif(strcmp(#OZFormParam.uv_juso_print#,&quot;1&quot;)){~OZ#CRLF    str = str + &quot;\n&quot; + #SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.BOADDR#;~OZ#CRLF}~OZ#CRLF~OZ#CRLFstr = str  + &quot;\n☏&quot; + #SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.BOTEL#~OZ#CRLF      + &quot;\n&quot; + #SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.BOZIP1# + &quot;-&quot; + #SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.BOZIP2#;~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;, str);" AUTOSIZE="true" AUTOSMALLER="true" PAINTALLOW="1" HALIGN="1"></ONESHAPE>
	<ONESHAPE NAME="라벨8" LEFT="160.90552" TOP="141.73228" WIDTH="184.25197" HEIGHT="14.173228" SCRIPTCODE="string str;~OZ#CRLF~OZ#CRLFstr = #SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.ADDR#~OZ#CRLF      + &quot;\n&quot; + #SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.ADDRDTLS#;~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;, str);~OZ#CRLF" PAINTALLOW="1" HALIGN="2"></ONESHAPE>
	<ONESHAPE NAME="라벨10" LEFT="160.90552" TOP="179.0" WIDTH="184.25197" HEIGHT="14.173228" SCRIPTCODE="string str;~OZ#CRLF~OZ#CRLFstr = #SP_SL_P_POST_DLVRDR_LIST.SET_ov_rdrlistcur.RDRNM#;~OZ#CRLF~OZ#CRLFif(strcmp(#OZFormParam.uv_honor_print#,&quot;1&quot;)){~OZ#CRLF    setattr(&quot;caption&quot;, str + &quot; 귀하&quot;);~OZ#CRLF}else{~OZ#CRLF    setattr(&quot;caption&quot;, str);~OZ#CRLF}~OZ#CRLF" PAINTALLOW="1" HALIGN="2"></ONESHAPE>
	<ONESHAPE NAME="라벨3" LEFT="283.7953" TOP="200.4252" WIDTH="51.023624" HEIGHT="24.09449" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_POST_DLVRDR_LIST" DATASETNAME="SET_ov_rdrlistcur" COLNAME="ZIP2" FORMAT_OPTION="normal#none" FONTSIZE="11" SPACING="13.0">&lt;SET_ov_rdrlistcur:ZIP2&gt;</ONESHAPE>
      </OZDATABAND>
    </OZREGION>
  </OZDATABAND>
  <OZBACKBAND NAME="배경1" WIDTH="768.189" HEIGHT="794.8347" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="3">
    <ONESHAPE NAME="라벨1" WIDTH="765.92126" HEIGHT="251.14961" SCRIPTCODE="setattr(&quot;caption&quot;, #OZFormParam.img_url# + &quot;oz_ocr.jpg&quot;);" NOPRINT="true" PAINTTYPE="2" PAINTALLOW="2" TRANSPARENT="false" IMGSTYLE="Fit">http://agency.chosun.com/html/comm_img/oz_ocr.jpg</ONESHAPE>
    <ONESHAPE NAME="라벨4" TOP="251.14963" WIDTH="765.92126" HEIGHT="251.14961" SCRIPTCODE="setattr(&quot;caption&quot;, #OZFormParam.img_url# + &quot;oz_ocr.jpg&quot;);" NOPRINT="true" PAINTTYPE="2" PAINTALLOW="2" TRANSPARENT="false" IMGSTYLE="Fit">http://agency.chosun.com/html/comm_img/oz_ocr.jpg</ONESHAPE>
    <ONESHAPE NAME="라벨5" TOP="502.29922" WIDTH="765.92126" HEIGHT="251.14961" SCRIPTCODE="setattr(&quot;caption&quot;, #OZFormParam.img_url# + &quot;oz_ocr.jpg&quot;);" NOPRINT="true" PAINTTYPE="2" PAINTALLOW="2" TRANSPARENT="false" IMGSTYLE="Fit">http://agency.chosun.com/html/comm_img/oz_ocr.jpg</ONESHAPE>
  </OZBACKBAND>
  <OZFONTDESC>
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_SL_P_POST_DLVRDR_LIST" GROUP="/" CATEGORY="/" ODINAME="SP_SL_P_POST_DLVRDR_LIST.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_SL_P_POST_DLVRDR_LIST" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_rdrlistcur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="iv_bocd" VALUE="00290" />
	<PARAMFIELD FIELDNAME="iv_medicd" VALUE="110" />
	<PARAMFIELD FIELDNAME="iv_frdst" VALUE="000" />
	<PARAMFIELD FIELDNAME="iv_todst" VALUE="123" />
	<PARAMFIELD FIELDNAME="iv_frbno" VALUE="000" />
	<PARAMFIELD FIELDNAME="iv_tobno" VALUE="123" />
	<PARAMFIELD FIELDNAME="iv_order_cond" VALUE="0" />
	<PARAMFIELD FIELDNAME="iv_srch_cond" VALUE="" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS>
    <OZFORMPARAM FIELDNAME="sv_url" TYPE="12" VALUE="" />
    <OZFORMPARAM FIELDNAME="sv_uid" TYPE="12" VALUE="" />
    <OZFORMPARAM FIELDNAME="sv_bonm" TYPE="12" VALUE="" />
    <OZFORMPARAM FIELDNAME="uv_juso_print" TYPE="12" VALUE="" />
    <OZFORMPARAM FIELDNAME="uv_po_print" TYPE="12" VALUE="" />
    <OZFORMPARAM FIELDNAME="uv_honor_print" TYPE="12" VALUE="" />
    <OZFORMPARAM FIELDNAME="uv_medi_print" TYPE="12" VALUE="" />
  </OZFORMPARAMS>
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

