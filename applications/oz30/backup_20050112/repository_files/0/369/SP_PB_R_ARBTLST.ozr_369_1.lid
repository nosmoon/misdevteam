OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="false" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="841.88983" PAPERHEIGHT="594.9921" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="false" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1074338897437" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCH="2" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="801.6379" HEIGHT="544.8189" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드1" SRC="" />
  <OZBAND NAME="페이지 헤더밴드1" WIDTH="801.6379" HEIGHT="32.0" BANDTYPE="1" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" FIRSTPAGESKIP="false">
    <ONESHAPE NAME="라벨4" LEFT="344.0" WIDTH="120.0" HEIGHT="32.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="14" FONTNAME="굴림" FONTSTYLE="1">중재요청정보</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="데이터 헤더밴드1" TOP="32.0" WIDTH="801.6379" HEIGHT="49.007874" BANDTYPE="5" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="14">
    <ONESHAPE NAME="라벨1" LEFT="725.6379" TOP="32.0" WIDTH="76.0" HEIGHT="17.007874" PAINTALLOW="1" BGCOLOR="-3355393">승인여부</ONESHAPE>
    <ONESHAPE NAME="라벨2" LEFT="646.0" TOP="32.0" WIDTH="80.0" HEIGHT="17.007874" PAINTALLOW="1" BGCOLOR="-3355393">등록여부</ONESHAPE>
    <ONESHAPE NAME="라벨5" LEFT="355.0" TOP="32.0" WIDTH="291.0" HEIGHT="17.007874" PAINTALLOW="1" BGCOLOR="-3355393">주소</ONESHAPE>
    <ONESHAPE NAME="라벨7" LEFT="240.0" TOP="32.0" WIDTH="115.0" HEIGHT="17.007874" PAINTALLOW="1" BGCOLOR="-3355393">매체</ONESHAPE>
    <ONESHAPE NAME="라벨8" LEFT="160.0" TOP="32.0" WIDTH="80.0" HEIGHT="17.007874" PAINTALLOW="1" BGCOLOR="-3355393">성명</ONESHAPE>
    <ONESHAPE NAME="라벨9" TOP="32.0" WIDTH="80.0" HEIGHT="17.007874" PAINTALLOW="1" BGCOLOR="-3355393">요청일자</ONESHAPE>
    <ONESHAPE NAME="라벨11" LEFT="64.0" TOP="8.0" WIDTH="58.0" HEIGHT="24.0" DATATYPE="4" PAINTALLOW="1" ODINAME="OZ_PB_L_READLST" DATASETNAME="OZParam" COLNAME="aplcdtfrom" FORMAT_OPTION="normal#none" NOFRAME="true">&lt;OZParam:aplcdtfrom&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨12" LEFT="8.0" TOP="9.0" WIDTH="55.0" HEIGHT="23.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true">조회기간 :</ONESHAPE>
    <ONESHAPE NAME="라벨13" LEFT="120.0" TOP="8.0" WIDTH="16.0" HEIGHT="24.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true">-</ONESHAPE>
    <ONESHAPE NAME="라벨14" LEFT="136.0" TOP="9.0" WIDTH="70.0" HEIGHT="23.0" DATATYPE="4" PAINTALLOW="1" ODINAME="OZ_PB_L_READLST" DATASETNAME="OZParam" COLNAME="aplcdtto" FORMAT_OPTION="normal#none" NOFRAME="true">&lt;OZParam:aplcdtto&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨15" LEFT="774.0" TOP="8.0" WIDTH="27.637878" HEIGHT="24.0" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" FORMAT_OPTION="normal#none" NOFRAME="true">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨16" LEFT="736.0" TOP="8.0" WIDTH="28.0" HEIGHT="24.0" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" FORMAT_OPTION="normal#none" NOFRAME="true">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨17" LEFT="760.0" TOP="8.0" WIDTH="24.0" HEIGHT="24.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true">/</ONESHAPE>
    <ONESHAPE NAME="라벨10" LEFT="80.0" TOP="32.0" WIDTH="80.0" HEIGHT="17.007874" PAINTALLOW="1" BGCOLOR="-3355393">요청번호</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="81.00787" WIDTH="801.6379" HEIGHT="17.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="데이터 헤더밴드1" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="8" ODINAME="SP_PB_L_ARBTLST_PRT" MASTER="리포트1" DATASOURCENAME="SET_curcommlist" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="ARBTAPLCDT" WIDTH="80.0" HEIGHT="17.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_L_ARBTLST_PRT" DATASETNAME="SET_curcommlist" COLNAME="ARBTAPLCDT">&lt;SET_curcommlist:ARBTAPLCDT&gt;</ONESHAPE>
    <ONESHAPE NAME="ARBTNO" LEFT="80.0" WIDTH="80.0" HEIGHT="17.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_L_ARBTLST_PRT" DATASETNAME="SET_curcommlist" COLNAME="ARBTNO">&lt;SET_curcommlist:ARBTNO&gt;</ONESHAPE>
    <ONESHAPE NAME="RDRNM" LEFT="160.0" WIDTH="80.0" HEIGHT="17.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_L_ARBTLST_PRT" DATASETNAME="SET_curcommlist" COLNAME="RDRNM">&lt;SET_curcommlist:RDRNM&gt;</ONESHAPE>
    <ONESHAPE NAME="MEDICDNM" LEFT="240.0" WIDTH="115.0" HEIGHT="17.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_L_ARBTLST_PRT" DATASETNAME="SET_curcommlist" COLNAME="MEDICDNM">&lt;SET_curcommlist:MEDICDNM&gt;</ONESHAPE>
    <ONESHAPE NAME="DLVADDR" LEFT="355.0" WIDTH="141.0" HEIGHT="17.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_L_ARBTLST_PRT" DATASETNAME="SET_curcommlist" COLNAME="DLVADDR" FORMAT_OPTION="normal#none" DRAWRIGHT="0.0">&lt;SET_curcommlist:DLVADDR&gt;</ONESHAPE>
    <ONESHAPE NAME="DLVDTLSADDR" LEFT="496.0" WIDTH="150.0" HEIGHT="17.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_L_ARBTLST_PRT" DATASETNAME="SET_curcommlist" COLNAME="DLVDTLSADDR" FORMAT_OPTION="normal#none" DRAWLEFT="0.0" HALIGN="1">&lt;SET_curcommlist:DLVDTLSADDR&gt;</ONESHAPE>
    <ONESHAPE NAME="REGCLSFCD" LEFT="646.0" WIDTH="80.0" HEIGHT="17.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_L_ARBTLST_PRT" DATASETNAME="SET_curcommlist" COLNAME="REGCLSFCD">&lt;SET_curcommlist:REGCLSFCD&gt;</ONESHAPE>
    <ONESHAPE NAME="APRVPROCCD" LEFT="726.0" WIDTH="75.63788" HEIGHT="17.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_L_ARBTLST_PRT" DATASETNAME="SET_curcommlist" COLNAME="APRVPROCCD">&lt;SET_curcommlist:APRVPROCCD&gt;</ONESHAPE>
  </OZDATABAND>
  <OZBAND NAME="페이지 풋터밴드1" TOP="98.00787" WIDTH="801.6379" HEIGHT="45.0" BANDTYPE="9" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" LASTPAGESKIP="false" />
  <OZBACKBAND NAME="배경1" WIDTH="801.6379" HEIGHT="544.8189" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
    <OZFONTFAMILY NAME="굴림" FONTFAMILY="Gulim" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_L_ARBTLST_PRT" GROUP="/" CATEGORY="/" ODINAME="SP_PB_L_ARBTLST_PRT.odi" FROMSERVER="true">
      <OZFORMSET NAME="SET_SP_PB_L_ARBTLST_PRT" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_curcommlist" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="bocd" VALUE="00001" />
	<PARAMFIELD FIELDNAME="arbtaplcdtfrom" VALUE="" />
	<PARAMFIELD FIELDNAME="arbtaplcdtto" VALUE="" />
	<PARAMFIELD FIELDNAME="dscttypecd" VALUE="" />
	<PARAMFIELD FIELDNAME="boprocyn" VALUE="" />
	<PARAMFIELD FIELDNAME="medicd" VALUE="" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

