OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="5.6692915" LEFTMARGIN="0.0" BOTTOMMARGIN="0.0" RIGHTMARGIN="59.52756" PAPERSIZE="0" PAPERWIDTH="1048.819" PAPERHEIGHT="720.0" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1101705957218" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="true" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="989.2914" HEIGHT="714.3307" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드3#%$oz*&amp;^데이터 밴드1" SRC="" />
  <OZDATABAND NAME="데이터 밴드3" WIDTH="989.2914" HEIGHT="144.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="true" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="3" ODINAME="SP_PB_P_SEND_ADDM_STICKER" MASTER="리포트1" DATASOURCENAME="SET_ov_sendcountcur" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨14" LEFT="336.0" TOP="24.0" WIDTH="264.0" HEIGHT="24.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="16" FONTNAME="굴림체" FONTSTYLE="1" DRAWBOTTOM="1.0">매체 추가 발송 마감 COUNT</ONESHAPE>
    <ONESHAPE NAME="라벨15" LEFT="336.0" TOP="56.0" WIDTH="176.0" HEIGHT="16.0" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;발송일  : &quot; +#SP_PB_P_SEND_ADDM_STICKER.OZParam.senddt#);" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1"></ONESHAPE>
    <OZTable NAME="테이블1" LEFT="338.0" TOP="88.0" WIDTH="238.0" HEIGHT="45.354336" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASET="SET_ov_sendcountcur" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="false" SELLABEL="MEDICD#%$oz*&amp;^CNT" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="false">
      <OZTTLABEL NAME="라벨13" WIDTH="134.0" HEIGHT="22.67717" PAINTALLOW="1" COLNAME="MEDICD" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="13" FONTNAME="굴림체" FONTSTYLE="1" DRAWTOP="1.0" DRAWBOTTOM="1.0" DRAWLEFT="1.0" DRAWRIGHT="1.0" HALIGN="1" INDEX_X="0" INDEX_Y="0">매 체 명</OZTTLABEL>
      <OZTTLABEL NAME="라벨12" LEFT="134.0" WIDTH="104.0" HEIGHT="22.67717" PAINTALLOW="1" COLNAME="CNT" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="13" FONTNAME="굴림체" FONTSTYLE="1" DRAWTOP="1.0" DRAWBOTTOM="1.0" DRAWLEFT="1.0" DRAWRIGHT="1.0" HALIGN="1" INDEX_X="1" INDEX_Y="0">부 수</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨17" TOP="22.67717" WIDTH="134.0" HEIGHT="22.677166" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_sendcountcur" COLNAME="MEDICD" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1" DRAWTOP="1.0" DRAWBOTTOM="1.0" DRAWLEFT="1.0" DRAWRIGHT="1.0" HALIGN="1" INDEX_X="0" INDEX_Y="1">MEDICD</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨16" LEFT="134.0" TOP="22.67717" WIDTH="104.0" HEIGHT="22.677166" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_sendcountcur" COLNAME="CNT" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" NOFRAME="true" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1" DRAWTOP="1.0" DRAWBOTTOM="1.0" DRAWLEFT="1.0" DRAWRIGHT="1.0" HALIGN="1" INDEX_X="1" INDEX_Y="1">CNT</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="144.0" WIDTH="989.2914" HEIGHT="676.9921" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="16" ODINAME="SP_PB_P_SEND_ADDM_STICKER" MASTER="리포트1" DATASOURCENAME="SET_ov_curcommlist" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨2" LEFT="361.13385" TOP="327.9685" WIDTH="272.0" HEIGHT="9.000002" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_curcommlist" COLNAME="DLVADDR" FONTSIZE="13" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">&lt;SET_ov_curcommlist:DLVADDR&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨3" LEFT="361.13385" TOP="346.9606" WIDTH="272.0" HEIGHT="10.000002" SCRIPTCODE="if (#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RECPCLSF# == &quot;O&quot; ){~OZ#CRLFsetattr(&quot;caption&quot;,#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DLVDTLSADDR# + &quot; &quot;+#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RDROFFINM#);~OZ#CRLF}else {~OZ#CRLFsetattr(&quot;caption&quot;,#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DLVDTLSADDR#);~OZ#CRLF}" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_curcommlist" COLNAME="DLVDTLSADDR" FONTSIZE="13" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1" WORDWRAP="true">&lt;SET_ov_curcommlist:DLVDTLSADDR&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨5" LEFT="382.6772" TOP="428.0315" WIDTH="282.04724" HEIGHT="15.0" SCRIPTCODE="if(#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RECPCLSF# ==&quot;O&quot; &amp;&amp; #SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RDRPOSI# !=&quot;&quot;) {~OZ#CRLFsetattr(&quot;caption&quot;,#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RDRNM#+&quot; &quot; +#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RDRPOSI#) ;~OZ#CRLF} else {~OZ#CRLFsetattr(&quot;caption&quot;,#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RDRNM#) ;~OZ#CRLF}~OZ#CRLF" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_curcommlist" COLNAME="RDRNM" FONTSIZE="16" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="2">&lt;SET_ov_curcommlist:RDRNM&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨6" LEFT="361.13385" TOP="306.99213" WIDTH="145.98425" HEIGHT="10.000002" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;독자번호 : &quot;+#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RDR_NO#);" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_curcommlist" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">&lt;SET_ov_curcommlist:&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨7" LEFT="666.9921" TOP="306.99213" WIDTH="121.0" HEIGHT="10.000002" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;구독기간 : &quot;+#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.SUBSFRDT#);" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_curcommlist" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="2">&lt;SET_ov_curcommlist:&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨8" LEFT="361.13385" TOP="472.0" WIDTH="113.0" HEIGHT="10.0" SCRIPTCODE="if (#SP_PB_P_SEND_ADDM_STICKER.OZParam.sendmthdcd#==&quot;10&quot; &amp;&amp; #SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RDRTEL_NO# != &quot;&quot;){~OZ#CRLFsetattr(&quot;caption&quot;,&quot;직배코드 :&quot;+#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DDLV_CD#+&quot;\nTEL :&quot; +#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RDRTEL_NO#);~OZ#CRLF} else if (#SP_PB_P_SEND_ADDM_STICKER.OZParam.sendmthdcd#==&quot;10&quot;  &amp;&amp; #SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.RDRTEL_NO# == &quot;&quot;) {~OZ#CRLFsetattr(&quot;caption&quot;,&quot;직배코드 :&quot;+#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DDLV_CD#);~OZ#CRLF}" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="1" VALIGN="1" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨9" LEFT="361.13385" TOP="367.937" WIDTH="122.0" HEIGHT="10.000002" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;발송호수 : &quot;+#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.MEDISER_NO#);" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_curcommlist" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">&lt;SET_ov_curcommlist:&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨18" LEFT="361.13385" TOP="384.09448" WIDTH="88.0" HEIGHT="10.000002" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;매체명 : &quot;+#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.MEDINM#);~OZ#CRLF " DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_curcommlist" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">&lt;SET_ov_curcommlist:&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨11" LEFT="361.13385" TOP="401.10236" WIDTH="125.0" HEIGHT="6.097069" SCRIPTCODE="if(#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.MEMO# !=&quot;&quot;) {~OZ#CRLFsetattr(&quot;caption&quot;,&quot;요청사항:  &quot; +#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.MEMO#);~OZ#CRLF} else {~OZ#CRLFsetattr(&quot;caption&quot;,&quot;&quot;);~OZ#CRLF}" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_curcommlist" COLNAME="MEMO" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1" HALIGN="1">&lt;SET_ov_curcommlist:MEMO&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨10" LEFT="236.12599" TOP="512.0" WIDTH="224.01575" HEIGHT="47.874023" DATATYPE="2" PAINTTYPE="3" PAINTALLOW="3" ODINAME="SP_PB_P_SEND_ADDM_STICKER" DATASETNAME="SET_ov_curcommlist" COLNAME="DLVZIP" FONTSIZE="14" FONTNAME="굴림체" FONTSTYLE="1" VALIGN="2" HALIGN="2" STYLE="19" H_ALIGNMENT="2">&lt;SET_ov_curcommlist:DLVZIP&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨19" LEFT="586.77167" TOP="541.41736" WIDTH="20.094482" HEIGHT="23.24408" SCRIPTCODE="setattr(&quot;caption&quot;,substr(#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DLVZIP#,0,1) );" PAINTALLOW="1" FONTSIZE="14" FONTSTYLE="1" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨20" LEFT="558.42523" TOP="541.41736" WIDTH="20.094482" HEIGHT="23.24408" SCRIPTCODE="setattr(&quot;caption&quot;,substr(#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DLVZIP#,1,1) );" PAINTALLOW="1" FONTSIZE="14" FONTSTYLE="1" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨21" LEFT="613.7008" TOP="541.41736" WIDTH="20.094482" HEIGHT="23.24408" SCRIPTCODE="setattr(&quot;caption&quot;,substr(#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DLVZIP#,2,1) );" PAINTALLOW="1" FONTSIZE="14" FONTSTYLE="1" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨22" LEFT="646.29926" TOP="541.41736" WIDTH="20.094482" HEIGHT="23.24408" SCRIPTCODE="setattr(&quot;caption&quot;,substr(#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DLVZIP#,3,1) );" PAINTALLOW="1" FONTSIZE="14" FONTSTYLE="1" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨23" LEFT="697.3229" TOP="541.41736" WIDTH="20.094482" HEIGHT="23.24408" SCRIPTCODE="setattr(&quot;caption&quot;,substr(#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DLVZIP#,5,1) );" PAINTALLOW="1" FONTSIZE="14" FONTSTYLE="1" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨24" LEFT="671.81104" TOP="541.41736" WIDTH="20.094482" HEIGHT="23.24408" SCRIPTCODE="setattr(&quot;caption&quot;,substr(#SP_PB_P_SEND_ADDM_STICKER.SET_ov_curcommlist.DLVZIP#,4,1) );" PAINTALLOW="1" FONTSIZE="14" FONTSTYLE="1" HALIGN="1"></ONESHAPE>
  </OZDATABAND>
  <OZBACKBAND NAME="배경1" WIDTH="989.2914" HEIGHT="714.3307" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="2">
    <ONESHAPE NAME="라벨1" WIDTH="515.9055" HEIGHT="263.62207" PAINTTYPE="2" PAINTALLOW="2" TRANSPARENT="false" IMGSTYLE="Fit"></ONESHAPE>
    <ONESHAPE NAME="라벨4" LEFT="473.38586" WIDTH="515.9055" HEIGHT="263.62207" PAINTTYPE="2" PAINTALLOW="2" TRANSPARENT="false" IMGSTYLE="Fit"></ONESHAPE>
  </OZBACKBAND>
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_SEND_ADDM_STICKER" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_SEND_ADDM_STICKER.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_SEND_ADDM_STICKER" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_curcommlist" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_sendcountcur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="senddt" VALUE="20040729" />
	<PARAMFIELD FIELDNAME="bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="sendmthdcd" VALUE="20" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

