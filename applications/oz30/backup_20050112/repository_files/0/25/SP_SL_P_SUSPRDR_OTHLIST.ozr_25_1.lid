OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="56.692913" LEFTMARGIN="19.842522" BOTTOMMARGIN="56.692913" RIGHTMARGIN="19.842522" PAPERSIZE="0" PAPERWIDTH="594.9921" PAPERHEIGHT="845.00793" SCRIPTBCE="false" VIRTUALX="1.3225" VIRTUALY="1.3225" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1090072436854" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" TOP="3.0" WIDTH="555.30707" HEIGHT="731.6221" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드5" SRC="" />
  <OZBAND NAME="페이지 헤더밴드1" WIDTH="555.30707" HEIGHT="72.0" BANDTYPE="1" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="18" FIRSTPAGESKIP="false">
    <ONESHAPE NAME="라벨3" WIDTH="555.30707" HEIGHT="28.0" SCRIPTCODE="setattr(&quot;caption&quot;, #SP_SL_P_SUSPRDR_OTHLIST.OZParam.iv_frcnclmm# + &quot;~&quot; + #SP_SL_P_SUSPRDR_OTHLIST.OZParam.iv_tocnclmm# + &quot;개월 타지 구독자&quot;);" AUTOSIZE="true" PAINTALLOW="1" NOFRAME="true" FONTSIZE="14" FONTNAME="굴림체" FONTSTYLE="1">개월 타지 구독자</ONESHAPE>
    <OZLINE NAME="선1" LEFT="193.0" TOP="24.0" WIDTH="165.0" HEIGHT="2.0" />
    <ONESHAPE NAME="Date" LEFT="473.35437" TOP="29.0" WIDTH="81.95273" HEIGHT="18.999998" DATATYPE="3" PAINTALLOW="1" COLNAME="Date" FORMAT="date_yyyy-MM-dd HH:mm" FORMAT_OPTION="custom#B" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Date&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨5" LEFT="416.0" TOP="29.0" WIDTH="56.0" HEIGHT="18.999998" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">출력일자 :</ONESHAPE>
    <OZLINE NAME="선3" TOP="48.0" WIDTH="555.30707" HEIGHT="2.0" THICKNESS="1.2" />
    <ONESHAPE NAME="라벨4" TOP="29.0" WIDTH="80.0" HEIGHT="18.999998" SCRIPTCODE="setattr(&quot;caption&quot;, &quot;지국명 : &quot; + #OZFormParam.sv_bonm#);" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨24" LEFT="210.0" TOP="29.0" WIDTH="136.0" HEIGHT="18.999998" SCRIPTCODE="if (#SP_SL_P_SUSPRDR_OTHLIST.OZParam.iv_basedt# != &quot;&quot;)~OZ#CRLF    setattr(&quot;caption&quot;, &quot;기준일자 : &quot; + substr(#SP_SL_P_SUSPRDR_OTHLIST.OZParam.iv_basedt#, 0, 4)  + &quot;-&quot;  +~OZ#CRLF                                         substr(#SP_SL_P_SUSPRDR_OTHLIST.OZParam.iv_basedt#, 4, 2)  + &quot;-&quot;  +~OZ#CRLF                                         substr(#SP_SL_P_SUSPRDR_OTHLIST.OZParam.iv_basedt#, 6, 2));" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체"></ONESHAPE>
    <ONESHAPE NAME="라벨7" LEFT="434.2677" TOP="50.0" WIDTH="48.95255" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">전화번호</ONESHAPE>
    <ONESHAPE NAME="라벨8" LEFT="276.37796" TOP="49.889767" WIDTH="64.062996" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">수금사항</ONESHAPE>
    <ONESHAPE NAME="라벨9" LEFT="87.874016" TOP="50.0" WIDTH="136.06299" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">독자주소.독자명</ONESHAPE>
    <ONESHAPE NAME="라벨10" TOP="50.0" WIDTH="87.874016" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">독자번호</ONESHAPE>
    <ONESHAPE NAME="라벨11" LEFT="223.93701" TOP="50.0" WIDTH="31.181103" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">매체</ONESHAPE>
    <ONESHAPE NAME="라벨12" LEFT="340.44098" TOP="49.889767" WIDTH="57.543304" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">확장일/유가</ONESHAPE>
    <ONESHAPE NAME="라벨14" LEFT="397.98422" TOP="50.0" WIDTH="36.0" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">확장자</ONESHAPE>
    <OZLINE NAME="선7" TOP="70.0" WIDTH="555.30707" HEIGHT="2.0" />
    <ONESHAPE NAME="라벨37" LEFT="483.30707" TOP="50.0" WIDTH="41.999992" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">중지일자</ONESHAPE>
    <ONESHAPE NAME="라벨38" LEFT="525.30707" TOP="50.0" WIDTH="30.0" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">사유</ONESHAPE>
    <ONESHAPE NAME="라벨20" LEFT="255.1181" TOP="49.889767" WIDTH="21.259844" HEIGHT="18.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">부수</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드5" TOP="72.0" WIDTH="555.30707" HEIGHT="2.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="데이터 풋터밴드3" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" MASTER="리포트1" DATASOURCENAME="MAST_DST" SUBDATALIST="데이터 밴드4" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="false" />
  <OZBAND NAME="데이터 풋터밴드3" TOP="74.0" WIDTH="555.30707" HEIGHT="19.0" BANDTYPE="7" PARENT="데이터 밴드5" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="3">
    <ONESHAPE NAME="라벨27" LEFT="433.95273" TOP="3.0" WIDTH="104.0" HEIGHT="16.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" FORMAT="#,###;-#,###" EXP="RDR_LIST.SUBSQTY.sum" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">RDR_LIST.SUBSQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨28" TOP="3.0" WIDTH="54.0" HEIGHT="16.0" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">합계 :</ONESHAPE>
    <OZLINE NAME="선2" TOP="1.0" WIDTH="555.30707" HEIGHT="2.0" THICKNESS="0.5" />
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드4" TOP="93.0" WIDTH="555.30707" HEIGHT="2.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="true" HEADERBANDNAME="" FOOTERBANDNAME="데이터 풋터밴드1" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" MASTER="데이터 밴드5" DATASOURCENAME="DST_LIST" SUBDATALIST="데이터 밴드2" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="false" />
  <OZBAND NAME="데이터 풋터밴드1" TOP="95.0" WIDTH="555.30707" HEIGHT="20.0" SCRIPTCODE="if (#OZFormParam.iv_subsum# == &quot;Y&quot;) {~OZ#CRLF    setattr(&quot;visible&quot;, &quot;true&quot;);~OZ#CRLF} else {~OZ#CRLF    setattr(&quot;visible&quot;, &quot;false&quot;);~OZ#CRLF}~OZ#CRLF" BANDTYPE="7" PARENT="데이터 밴드4" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="2">
    <ONESHAPE NAME="라벨13" LEFT="434.29926" WIDTH="104.0" HEIGHT="20.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" FORMAT="#,###;-#,###" EXP="RDR_LIST.SUBSQTY.sum" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">RDR_LIST.SUBSQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨18" WIDTH="54.0" HEIGHT="19.0" SCRIPTCODE="if (#SP_SL_P_SUSPRDR_OTHLIST.MAST_DST.DLVTEAMCD# == &quot; &quot;)~OZ#CRLF    setattr(&quot;caption&quot;, &quot;조계(기타) : &quot;);~OZ#CRLFelse~OZ#CRLF    setattr(&quot;caption&quot;, &quot;조계(&quot; + #SP_SL_P_SUSPRDR_OTHLIST.MAST_DST.DLVTEAMCD# + &quot;) : &quot;);" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">소계 :</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드2" TOP="115.0" WIDTH="555.30707" HEIGHT="34.015755" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="true" HEADERBANDNAME="" FOOTERBANDNAME="데이터 풋터밴드2" HEADERDUMMY="" FOOTERDUMMY="" COUNT="12" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" MASTER="데이터 밴드4" DATASOURCENAME="RDR_LIST" SUBDATALIST="" FIXEDTITLE="true" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨29" LEFT="397.98422" WIDTH="36.0" HEIGHT="11.338583" SCRIPTCODE="if (strlenb(getattr(&quot;caption&quot;)) &gt; 6)~OZ#CRLF    setattr(&quot;fontsize&quot;, &quot;7&quot;);" AUTOSIZE="true" AUTOSMALLER="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="EXTNNM" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">&lt;RDR_LIST:EXTNNM&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨30" LEFT="340.44098" WIDTH="57.543304" HEIGHT="11.338583" SCRIPTCODE="setattr(&quot;caption&quot;, #SP_SL_P_SUSPRDR_OTHLIST.RDR_LIST.RDR_EXTNDT# + &quot;/&quot; + #SP_SL_P_SUSPRDR_OTHLIST.RDR_LIST.VALMM#);" AUTOSIZE="true" AUTOSMALLER="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="RDR_EXTNDT" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체">&lt;RDR_LIST:RDR_EXTNDT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨33" LEFT="276.37796" WIDTH="64.062996" HEIGHT="11.338583" SCRIPTCODE="if (#SP_SL_P_SUSPRDR_OTHLIST.RDR_LIST.MTHDNM# ==&quot;&quot;)~OZ#CRLF    setattr(&quot;caption&quot;, &quot;------------&quot;);" AUTOSIZE="true" AUTOSMALLER="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="MTHDNM" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체">&lt;RDR_LIST:MTHDNM&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨34" LEFT="434.2677" WIDTH="48.95255" HEIGHT="11.338583" SCRIPTCODE="if (strlenb(getattr(&quot;caption&quot;)) &gt; 9)~OZ#CRLF    setattr(&quot;fontsize&quot;, &quot;7&quot;);" AUTOSIZE="true" AUTOSMALLER="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="TELNO" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">&lt;RDR_LIST:TELNO&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨31" LEFT="483.30707" WIDTH="41.999992" HEIGHT="11.338583" AUTOSIZE="true" AUTOSMALLER="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="SUSPDT" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">&lt;RDR_LIST:SUSPDT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨32" LEFT="525.2598" WIDTH="30.0" HEIGHT="11.338583" AUTOSIZE="true" AUTOSMALLER="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="CICDNM" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">&lt;RDR_LIST:CICDNM&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨2" LEFT="223.93701" WIDTH="31.181103" HEIGHT="11.338583" SCRIPTCODE="setattr(&quot;caption&quot;, #SP_SL_P_SUSPRDR_OTHLIST.RDR_LIST.CICDYNM# + getattr(&quot;caption&quot;));~OZ#CRLFsetattr(&quot;halign&quot;, &quot;right&quot;);" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="SUBSUPRC" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">&lt;RDR_LIST:SUBSUPRC&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨1" LEFT="255.1181" WIDTH="21.259844" HEIGHT="11.338583" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="SUBSQTY" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">&lt;RDR_LIST:SUBSQTY&gt;</ONESHAPE>
    <OZGROUPLABEL2 NAME="그룹라벨2" WIDTH="88.0" HEIGHT="11.338583" AUTOSIZE="true" AUTOSMALLER="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="RDR_NUM" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" PRIORLABELNAME="Root" FIXEDNEWPAGE="false">&lt;G&gt;RDR_NUM</OZGROUPLABEL2>
    <OZGROUPLABEL2 NAME="그룹라벨1" LEFT="88.0" WIDTH="136.0" HEIGHT="11.338583" SCRIPTCODE="if (strlenb(#SP_SL_P_SUSPRDR_OTHLIST.RDR_LIST.DLVADDR#) &gt; 24)~OZ#CRLF    setattr(&quot;fontsize&quot;, &quot;7&quot;);" AUTOSIZE="true" AUTOSMALLER="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="DLVADDR" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" PRIORLABELNAME="그룹라벨2" FIXEDNEWPAGE="false">&lt;G&gt;DLVADDR</OZGROUPLABEL2>
    <ONESHAPE NAME="라벨39" LEFT="88.0" TOP="11.338577" WIDTH="467.30707" HEIGHT="11.338583" AUTOSIZE="true" AUTOSMALLER="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" DATASETNAME="RDR_LIST" COLNAME="REMK" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">&lt;RDR_LIST:REMK&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨19" TOP="22.67717" WIDTH="555.30707" HEIGHT="11.338583" SCRIPTCODE="int n, height, top;~OZ#CRLFn = #OZFormParam.iv_line#;~OZ#CRLF~OZ#CRLF//height = (int)getattr(&quot;height&quot;);~OZ#CRLF//height = (int) getcompattr(&quot;라벨39&quot;, &quot;height&quot;) + (int) getcompattr(&quot;그룹라벨1&quot;, &quot;height&quot;);~OZ#CRLFheight = 20;~OZ#CRLFsetattr(&quot;height&quot;, (string)(n*height));~OZ#CRLF~OZ#CRLFtop = (int) getcompattr(&quot;라벨39&quot;, &quot;toppose&quot;) + (int)getcompattr(&quot;라벨39&quot;, &quot;height&quot;);~OZ#CRLFsetattr(&quot;toppose&quot;, (string)(top));~OZ#CRLF~OZ#CRLF" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체"></ONESHAPE>
  </OZDATABAND>
  <OZBAND NAME="데이터 풋터밴드2" TOP="149.01575" WIDTH="555.30707" HEIGHT="22.0" SCRIPTCODE="if (#OZFormParam.iv_subsum# == &quot;Y&quot;) {~OZ#CRLF    setattr(&quot;visible&quot;, &quot;true&quot;);~OZ#CRLF} else {~OZ#CRLF    setattr(&quot;visible&quot;, &quot;false&quot;);~OZ#CRLF}~OZ#CRLF~OZ#CRLF" BANDTYPE="7" PARENT="데이터 밴드2" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="4">
    <ONESHAPE NAME="DST_CNT" LEFT="434.29922" TOP="1.0" WIDTH="104.0" HEIGHT="20.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_SUSPRDR_OTHLIST" FORMAT="#,###;-#,###" EXP="RDR_LIST.SUBSQTY.sum" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">RDR_LIST.SUBSQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨15" TOP="1.0" WIDTH="54.0" HEIGHT="19.0" SCRIPTCODE="if (#SP_SL_P_SUSPRDR_OTHLIST.DST_LIST.DLVDSTCCD# == &quot;&quot;)~OZ#CRLF    setattr(&quot;caption&quot;, &quot;소계(기타) : &quot;);~OZ#CRLFelse~OZ#CRLF    setattr(&quot;caption&quot;, &quot;소계(&quot; + #SP_SL_P_SUSPRDR_OTHLIST.DST_LIST.DLVDSTCCD# + &quot;) : &quot;);" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">소계 :</ONESHAPE>
    <OZLINE NAME="선4" TOP="2.0" WIDTH="555.30707" HEIGHT="2.0" THICKNESS="0.5" />
    <OZLINE NAME="선5" TOP="20.0" WIDTH="555.30707" HEIGHT="2.0" THICKNESS="0.5" />
  </OZBAND>
  <OZBAND NAME="페이지 풋터밴드1" TOP="171.01575" WIDTH="555.30707" HEIGHT="16.17323" BANDTYPE="9" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="6" LASTPAGESKIP="false">
    <OZLINE NAME="선6" TOP="1.0" WIDTH="555.30707" HEIGHT="2.0" THICKNESS="1.2" />
    <ONESHAPE NAME="라벨16" LEFT="275.03238" TOP="2.0" WIDTH="8.0" HEIGHT="14.173228" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체">/</ONESHAPE>
    <ONESHAPE NAME="라벨6" LEFT="235.0" TOP="2.0" WIDTH="40.03238" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨17" LEFT="283.03238" TOP="2.0" WIDTH="45.0" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨22" LEFT="451.29935" TOP="2.0" WIDTH="103.99988" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;, #OZFormParam.sv_bonm# + &quot;지국 &quot; + #OZFormParam.sv_uid#);" PAINTALLOW="1" FORMAT_OPTION="normal#none" TRANSPARENT="true" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" VALIGN="2" HALIGN="2"></ONESHAPE>
    <ONESHAPE NAME="라벨23" TOP="2.0" WIDTH="104.0" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;, &quot;PGNM : &quot; + #OZFormParam.sv_url#);" PAINTALLOW="1" FORMAT_OPTION="normal#none" TRANSPARENT="true" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
  </OZBAND>
  <OZBACKBAND NAME="배경1" WIDTH="555.30707" HEIGHT="731.6221" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_SL_P_SUSPRDR_OTHLIST" GROUP="/" CATEGORY="/" ODINAME="SP_SL_P_SUSPRDR_OTHLIST.odi" FROMSERVER="false">
      <OZFORMSET NAME="SP_SL_P_SUSPRDR_OTHLIST" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_rdrlistcur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_sumlistcur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="MAST_DST" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="DST_LIST" MASTERSET="MAST_DST" USED="true" MAXROW="0" />
      <OZFORMSET NAME="RDR_LIST" MASTERSET="DST_LIST" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="iv_bocd" VALUE="00290" />
	<PARAMFIELD FIELDNAME="iv_frdst" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_todst" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_medicd" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_basedt" VALUE="20040717" />
	<PARAMFIELD FIELDNAME="iv_frcnclmm" VALUE="0" />
	<PARAMFIELD FIELDNAME="iv_tocnclmm" VALUE="5" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS>
    <OZFORMPARAM FIELDNAME="iv_subsum" TYPE="12" VALUE="Y" />
    <OZFORMPARAM FIELDNAME="iv_line" TYPE="12" VALUE="0" />
    <OZFORMPARAM FIELDNAME="sv_bonm" TYPE="12" VALUE="TEST" />
    <OZFORMPARAM FIELDNAME="sv_uid" TYPE="12" VALUE="SLAYERS" />
    <OZFORMPARAM FIELDNAME="sv_url" TYPE="12" VALUE="TEST/001" />
  </OZFORMPARAMS>
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

