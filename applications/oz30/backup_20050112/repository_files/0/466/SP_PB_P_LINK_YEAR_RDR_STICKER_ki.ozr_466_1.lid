OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="0.0" LEFTMARGIN="0.0" BOTTOMMARGIN="0.0" RIGHTMARGIN="0.0" PAPERSIZE="0" PAPERWIDTH="765.3543" PAPERHEIGHT="649.13385" SCRIPTBCE="false" VIRTUALX="1.4625945" VIRTUALY="1.4625945" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1095074701500" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="true" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="765.3543" HEIGHT="649.13385" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드1" SRC="" />
  <OZDATABAND NAME="데이터 밴드1" WIDTH="765.3543" HEIGHT="799.3701" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" MASTER="리포트1" DATASOURCENAME="SET_ov_linkrdrcur" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZREGION NAME="리전1" WIDTH="345.82678" HEIGHT="107.71654" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드2" SRC="" BINDTYPE="5" HGAP="0.0" VGAP="0.0">
      <OZDATABAND NAME="데이터 밴드2" WIDTH="345.82678" HEIGHT="107.71654" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="9" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" MASTER="리전1" DATASOURCENAME="SET_ov_linkrdrcur" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
	<ONESHAPE NAME="라벨3" LEFT="12.755906" TOP="28.078741" WIDTH="275.24408" HEIGHT="9.921261" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" DATASETNAME="SET_ov_linkrdrcur" COLNAME="DLVADDR" FONTSIZE="9" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1" WORDWRAP="true">&lt;SET_ov_linkrdrcur:DLVADDR&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨6" LEFT="65.48031" TOP="39.0" WIDTH="232.7244" HEIGHT="18.000004" SCRIPTCODE="setattr(&quot;caption&quot;,#SP_PB_P_LINK_YEAR_RDR_STICKER.SET_ov_linkrdrcur.RDR_NM#+&quot;  귀하&quot;) ;" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" DATASETNAME="SET_ov_linkrdrcur" COLNAME="RDR_NM" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="2">&lt;SET_ov_linkrdrcur:RDR_NM&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨7" LEFT="13.039371" TOP="17.007874" WIDTH="146.0" HEIGHT="9.921261" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;독자번호 : &quot;+#SP_PB_P_LINK_YEAR_RDR_STICKER.SET_ov_linkrdrcur.RDR_NO#);" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" DATASETNAME="SET_ov_linkrdrcur" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">&lt;SET_ov_linkrdrcur:&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨8" LEFT="183.96849" TOP="17.007874" WIDTH="113.10237" HEIGHT="9.921261" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;구독기간 : &quot;+#SP_PB_P_LINK_YEAR_RDR_STICKER.SET_ov_linkrdrcur.SUBSSER_NO#);" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" DATASETNAME="SET_ov_linkrdrcur" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="2">&lt;SET_ov_linkrdrcur:&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨10" LEFT="13.039371" TOP="79.937004" WIDTH="113.0" HEIGHT="13.889765" SCRIPTCODE="if (#SP_PB_P_LINK_YEAR_RDR_STICKER.SET_ov_linkrdrcur.RDRTEL# == &quot;&quot;){~OZ#CRLFsetattr(&quot;caption&quot;,&quot;TEL : &quot;);~OZ#CRLF}else{~OZ#CRLFsetattr(&quot;caption&quot;,&quot;TEL : &quot;+#SP_PB_P_LINK_YEAR_RDR_STICKER.SET_ov_linkrdrcur.RDRTEL#);~OZ#CRLF}" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" DATASETNAME="SET_ov_linkrdrcur" COLNAME="RECPPERSDTLSADDR" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">&lt;SET_ov_linkrdrcur:RECPPERSDTLSADDR&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨9" LEFT="137.7638" TOP="70.0" WIDTH="159.02364" HEIGHT="24.889761" SCRIPTCODE="setattr(&quot;caption&quot;,substr(#SP_PB_P_LINK_YEAR_RDR_STICKER.SET_ov_linkrdrcur.DLVZIP#,0,3)+substr(#SP_PB_P_LINK_YEAR_RDR_STICKER.SET_ov_linkrdrcur.DLVZIP#,4,3));" DATATYPE="2" PAINTTYPE="3" PAINTALLOW="3" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" DATASETNAME="SET_ov_linkrdrcur" COLNAME="DLVZIP" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="2" STYLE="19" H_ALIGNMENT="2">&lt;SET_ov_linkrdrcur:DLVZIP&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨11" LEFT="13.039371" TOP="70.015755" WIDTH="40.0" HEIGHT="12.000002" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;매체명 : &quot;+#SP_PB_P_LINK_YEAR_RDR_STICKER.SET_ov_linkrdrcur.MEDINM#);~OZ#CRLF " DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" DATASETNAME="SET_ov_linkrdrcur" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">&lt;SET_ov_linkrdrcur:&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨2" LEFT="57.0" TOP="60.078743" WIDTH="38.0" HEIGHT="9.070869" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER" DATASETNAME="SET_ov_linkrdrcur" COLNAME="LINKYEAR" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">&lt;SET_ov_linkrdrcur:LINKYEAR&gt;</ONESHAPE>
	<ONESHAPE NAME="라벨5" LEFT="13.039371" TOP="60.078743" WIDTH="40.0" HEIGHT="9.070866" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">연결연차 :</ONESHAPE>
      </OZDATABAND>
    </OZREGION>
  </OZDATABAND>
  <OZBACKBAND NAME="배경1" WIDTH="765.3543" HEIGHT="649.13385" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="2">
    <ONESHAPE NAME="라벨1" WIDTH="515.9055" HEIGHT="263.62207" PAINTTYPE="2" PAINTALLOW="2" TRANSPARENT="false" IMGSTYLE="Fit"></ONESHAPE>
    <ONESHAPE NAME="라벨4" LEFT="62.078735" WIDTH="515.9055" HEIGHT="263.62207" PAINTTYPE="2" PAINTALLOW="2" TRANSPARENT="false" IMGSTYLE="Fit"></ONESHAPE>
  </OZBACKBAND>
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_LINK_YEAR_RDR_STICKER" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_LINK_YEAR_RDR_STICKER.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_LINK_YEAR_RDR" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_linkrdrcur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="incmgpers" VALUE="" />
	<PARAMFIELD FIELDNAME="medicd" VALUE="270" />
	<PARAMFIELD FIELDNAME="yearfr" VALUE="11" />
	<PARAMFIELD FIELDNAME="yearto" VALUE="11" />
	<PARAMFIELD FIELDNAME="subsno" VALUE="" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS>
    <OZFORMPARAM FIELDNAME="img_url" TYPE="12" VALUE="http://localhost:7001/html/comm_img/" />
  </OZFORMPARAMS>
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

