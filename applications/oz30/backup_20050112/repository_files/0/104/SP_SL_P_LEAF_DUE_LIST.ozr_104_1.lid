OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="56.692913" LEFTMARGIN="20.125984" BOTTOMMARGIN="56.692913" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="594.9921" PAPERHEIGHT="841.88983" SCRIPTBCE="false" VIRTUALX="1.3225" VIRTUALY="1.3225" MAPMODE="4" IGNORENULLDATA="false" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1083831901546" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="8" FONTNAME="굴림" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="554.7402" HEIGHT="728.50397" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드1" SRC="" />
  <OZBAND NAME="페이지 헤더밴드1" WIDTH="554.7402" HEIGHT="44.17323" BANDTYPE="1" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="4" FIRSTPAGESKIP="false">
    <ONESHAPE NAME="라벨1" WIDTH="554.7402" HEIGHT="28.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="15" FONTNAME="굴림체" FONTSTYLE="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">미수현황</ONESHAPE>
    <ONESHAPE NAME="라벨30" LEFT="450.74017" TOP="30.0" WIDTH="104.0" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Date" FORMAT="date_yyyy-MM-dd hh:mm" FORMAT_OPTION="custom#B" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Date&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨31" TOP="30.0" WIDTH="80.0" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;, &quot;지국명 : &quot; + #OZFormParam.sv_bonm# + &quot;지국&quot; );" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨29" LEFT="408.0" TOP="30.0" WIDTH="56.0" HEIGHT="14.173228" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">출력일자 :</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="데이터 헤더밴드1" TOP="44.17323" WIDTH="554.7402" HEIGHT="16.0" BANDTYPE="5" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="7">
    <ONESHAPE NAME="라벨2" WIDTH="56.0" HEIGHT="16.0" PAINTALLOW="1">순번</ONESHAPE>
    <ONESHAPE NAME="라벨3" LEFT="56.0" WIDTH="67.0" HEIGHT="16.0" PAINTALLOW="1">일자</ONESHAPE>
    <ONESHAPE NAME="라벨4" LEFT="123.0" WIDTH="132.0" HEIGHT="16.0" PAINTALLOW="1">광고처</ONESHAPE>
    <ONESHAPE NAME="라벨5" LEFT="255.0" WIDTH="99.0" HEIGHT="16.0" PAINTALLOW="1">전화</ONESHAPE>
    <ONESHAPE NAME="라벨6" LEFT="354.0" WIDTH="64.0" HEIGHT="16.0" PAINTALLOW="1">미수</ONESHAPE>
    <ONESHAPE NAME="라벨7" LEFT="418.0" WIDTH="70.0" HEIGHT="16.0" PAINTALLOW="1">당월수주</ONESHAPE>
    <ONESHAPE NAME="라벨8" LEFT="487.74017" WIDTH="67.0" HEIGHT="16.0" PAINTALLOW="1">당월입금</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="60.17323" WIDTH="554.7402" HEIGHT="8.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="데이터 헤더밴드1" FOOTERBANDNAME="데이터 풋터밴드2" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" ODINAME="SP_SL_P_LEAF_DUE_LIST" MASTER="리포트1" DATASOURCENAME="Shadow_Master" SUBDATALIST="데이터 밴드2" FIXEDTITLE="true" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="false" />
  <OZBAND NAME="데이터 풋터밴드2" TOP="68.17323" WIDTH="554.7402" HEIGHT="16.0" BANDTYPE="7" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="4">
    <ONESHAPE NAME="라벨20" WIDTH="354.0" HEIGHT="16.0" PAINTALLOW="1">합            계</ONESHAPE>
    <ONESHAPE NAME="라벨21" LEFT="487.74017" WIDTH="67.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" EXP="Shadow_Detail.CLAMT" HALIGN="2">Shadow_Detail.CLAMT</ONESHAPE>
    <ONESHAPE NAME="라벨22" LEFT="418.0" WIDTH="70.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" EXP="Shadow_Detail.CNTRAMT" HALIGN="2">Shadow_Detail.CNTRAMT</ONESHAPE>
    <ONESHAPE NAME="라벨23" LEFT="354.0" WIDTH="64.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" EXP="Shadow_Detail.RCPM_AMT" HALIGN="2">Shadow_Detail.RCPM_AMT</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드2" TOP="84.17323" WIDTH="554.7402" HEIGHT="16.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="데이터 풋터밴드1" HEADERDUMMY="" FOOTERDUMMY="" COUNT="7" ODINAME="SP_SL_P_LEAF_DUE_LIST" MASTER="데이터 밴드1" DATASOURCENAME="Shadow_Detail" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨9" WIDTH="56.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" DATASETNAME="Shadow_Detail" COLNAME="ROWNUM">&lt;Shadow_Detail:ROWNUM&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨10" LEFT="56.0" WIDTH="67.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" DATASETNAME="Shadow_Detail" COLNAME="ADVTDT">&lt;Shadow_Detail:ADVTDT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨11" LEFT="123.0" WIDTH="132.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" DATASETNAME="Shadow_Detail" COLNAME="DLCONM">&lt;Shadow_Detail:DLCONM&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨12" LEFT="255.0" WIDTH="99.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" DATASETNAME="Shadow_Detail" COLNAME="TEL">&lt;Shadow_Detail:TEL&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨13" LEFT="354.0" WIDTH="64.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" DATASETNAME="Shadow_Detail" COLNAME="RCPM_AMT" HALIGN="2">&lt;Shadow_Detail:RCPM_AMT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨14" LEFT="418.0" WIDTH="70.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" DATASETNAME="Shadow_Detail" COLNAME="CNTRAMT" HALIGN="2">&lt;Shadow_Detail:CNTRAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨15" LEFT="487.74017" WIDTH="67.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" DATASETNAME="Shadow_Detail" COLNAME="CLAMT" HALIGN="2">&lt;Shadow_Detail:CLAMT&gt;</ONESHAPE>
  </OZDATABAND>
  <OZBAND NAME="데이터 풋터밴드1" TOP="100.17323" WIDTH="554.7402" HEIGHT="16.0" BANDTYPE="7" PARENT="데이터 밴드2" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="4">
    <ONESHAPE NAME="라벨16" WIDTH="354.0" HEIGHT="16.0" PAINTALLOW="1">소            계</ONESHAPE>
    <ONESHAPE NAME="라벨17" LEFT="487.74017" WIDTH="67.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" EXP="Shadow_Detail.CLAMT" HALIGN="2">Shadow_Detail.CLAMT</ONESHAPE>
    <ONESHAPE NAME="라벨18" LEFT="418.0" WIDTH="70.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" EXP="Shadow_Detail.CNTRAMT" HALIGN="2">Shadow_Detail.CNTRAMT</ONESHAPE>
    <ONESHAPE NAME="라벨19" LEFT="354.0" WIDTH="64.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_LEAF_DUE_LIST" EXP="Shadow_Detail.RCPM_AMT" HALIGN="2">Shadow_Detail.RCPM_AMT</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="페이지 풋터밴드1" TOP="116.17323" WIDTH="554.7402" HEIGHT="14.173228" BANDTYPE="9" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="5" LASTPAGESKIP="false">
    <ONESHAPE NAME="라벨24" LEFT="278.03238" WIDTH="8.0" HEIGHT="14.173228" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체">/</ONESHAPE>
    <ONESHAPE NAME="라벨25" LEFT="232.0" WIDTH="46.03238" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨26" LEFT="286.03238" WIDTH="45.0" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨27" LEFT="450.7403" WIDTH="103.99988" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;, #OZFormParam.sv_bonm# + &quot;지국 &quot; + #OZFormParam.sv_uid#);" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" VALIGN="2" HALIGN="2"></ONESHAPE>
    <ONESHAPE NAME="라벨28" WIDTH="104.0" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;, &quot;PGNM : &quot; + #OZFormParam.sv_url#);" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
  </OZBAND>
  <OZBACKBAND NAME="배경1" WIDTH="554.7402" HEIGHT="728.50397" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="굴림" FONTFAMILY="Gulim" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_SL_P_LEAF_DUE_LIST" GROUP="/" CATEGORY="/" ODINAME="SP_SL_P_LEAF_DUE_LIST.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_Proc_Due_List" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_List" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_Master" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_Detail" MASTERSET="Shadow_Master" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="iv_bocd" VALUE="00100" />
	<PARAMFIELD FIELDNAME="iv_fradvtdt" VALUE="20040101" />
	<PARAMFIELD FIELDNAME="iv_toadvtdt" VALUE="20040101" />
	<PARAMFIELD FIELDNAME="iv_dlcocd" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_kindcd" VALUE="" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS>
    <OZFORMPARAM FIELDNAME="sv_url" TYPE="12" VALUE="TEST/001" />
    <OZFORMPARAM FIELDNAME="sv_uid" TYPE="12" VALUE="TEST" />
    <OZFORMPARAM FIELDNAME="sv_bonm" TYPE="12" VALUE="Slayert" />
  </OZFORMPARAMS>
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

