OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="false" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="841.88983" PAPERHEIGHT="594.9921" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1095402857328" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="801.6379" HEIGHT="544.8189" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드1" SRC="" />
  <OZBAND NAME="타이틀 밴드1" WIDTH="801.6379" HEIGHT="28.0" BANDTYPE="2" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨2" WIDTH="801.6379" HEIGHT="28.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1">단행본 마감</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="데이터 헤더밴드1" TOP="28.0" WIDTH="801.6379" HEIGHT="32.0" BANDTYPE="5" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="4">
    <ONESHAPE NAME="라벨11" TOP="8.0" WIDTH="96.0" HEIGHT="16.0" SCRIPTCODE="string senddt;~OZ#CRLFsenddt = substr(#SP_PB_P_SEPBKCLOS.OZParam.senddt#,0,4)+&quot;/&quot;+substr(#SP_PB_P_SEPBKCLOS.OZParam.senddt#,4,2)+&quot;/&quot;+substr(#SP_PB_P_SEPBKCLOS.OZParam.senddt#,6,2);~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;,&quot;발송일 : &quot;+senddt);" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" DRAWRIGHT="0.0"></ONESHAPE>
    <ONESHAPE NAME="Total_Page" LEFT="760.0" TOP="8.0" WIDTH="27.637878" HEIGHT="17.0" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" DRAWLEFT="0.0" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨13" LEFT="728.0" TOP="8.0" WIDTH="32.0" HEIGHT="17.0" SCRIPTCODE="setattr(&quot;caption&quot;,#OZSystem.Page_Number#+&quot;  / &quot;);" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2"></ONESHAPE>
    <ONESHAPE NAME="라벨14" LEFT="96.0" TOP="8.0" WIDTH="120.0" HEIGHT="16.0" SCRIPTCODE="string sendmthdnm;~OZ#CRLFsendmthdnm = #SP_PB_P_SEPBKCLOS.SET_curcommlist.SENDMTHDNM#;~OZ#CRLFsetattr(&quot;caption&quot;,&quot; 발송방법:&quot;+sendmthdnm);" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" DRAWLEFT="0.0" DRAWRIGHT="0.0"></ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="60.0" WIDTH="801.6379" HEIGHT="32.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="데이터 헤더밴드1" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_SEPBKCLOS" MASTER="리포트1" DATASOURCENAME="SET_curcommlist" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블1" WIDTH="800.25195" HEIGHT="31.874016" ODINAME="SP_PB_P_SEPBKCLOS" DATASET="SET_curcommlist" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="false" SELLABEL="SEP_BOOKSUBSNO#%$oz*&amp;^APLCDT#%$oz*&amp;^RDRNM#%$oz*&amp;^SEP_BOOKCDNM#%$oz*&amp;^QTY#%$oz*&amp;^RDRZIP#%$oz*&amp;^RDRADDRALL" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="true">
      <OZTTLABEL NAME="라벨3" WIDTH="56.125984" HEIGHT="16.0" PAINTALLOW="1" COLNAME="SEP_BOOKSUBSNO" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="0">단행본번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨1" LEFT="56.125984" WIDTH="56.0" HEIGHT="16.0" PAINTALLOW="1" COLNAME="APLCDT" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="0">신청일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨4" LEFT="112.125984" WIDTH="111.9685" HEIGHT="16.0" PAINTALLOW="1" COLNAME="RDRNM" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="0">성명</OZTTLABEL>
      <OZTTLABEL NAME="라벨5" LEFT="224.09448" WIDTH="128.12598" HEIGHT="16.0" PAINTALLOW="1" COLNAME="SEP_BOOKCDNM" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="0">상품명</OZTTLABEL>
      <OZTTLABEL NAME="라벨6" LEFT="352.22046" WIDTH="47.905518" HEIGHT="16.0" PAINTALLOW="1" COLNAME="QTY" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="0">부수</OZTTLABEL>
      <OZTTLABEL NAME="라벨7" LEFT="400.12598" WIDTH="56.0" HEIGHT="16.0" PAINTALLOW="1" COLNAME="RDRZIP" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="0">우편번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨8" LEFT="456.12598" WIDTH="344.12598" HEIGHT="16.0" PAINTALLOW="1" COLNAME="RDRADDRALL" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="6" INDEX_Y="0">주소</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨10" TOP="16.0" WIDTH="56.125984" HEIGHT="15.874016" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEPBKCLOS" DATASETNAME="SET_curcommlist" COLNAME="SEP_BOOKSUBSNO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="1">SEP_BOOKSUBSNO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨9" LEFT="56.125984" TOP="16.0" WIDTH="56.0" HEIGHT="15.874016" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEPBKCLOS" DATASETNAME="SET_curcommlist" COLNAME="APLCDT" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="1">APLCDT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨20" LEFT="112.125984" TOP="16.0" WIDTH="111.9685" HEIGHT="15.874016" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEPBKCLOS" DATASETNAME="SET_curcommlist" COLNAME="RDRNM" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" INDEX_X="2" INDEX_Y="1">RDRNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨12" LEFT="224.09448" TOP="16.0" WIDTH="128.12598" HEIGHT="15.874016" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEPBKCLOS" DATASETNAME="SET_curcommlist" COLNAME="SEP_BOOKCDNM" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" INDEX_X="3" INDEX_Y="1">SEP_BOOKCDNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨21" LEFT="352.22046" TOP="16.0" WIDTH="47.905518" HEIGHT="15.874016" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEPBKCLOS" DATASETNAME="SET_curcommlist" COLNAME="QTY" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2" RIGHTMARGIN="5.0" INDEX_X="4" INDEX_Y="1">QTY</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨23" LEFT="400.12598" TOP="16.0" WIDTH="56.0" HEIGHT="15.874016" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEPBKCLOS" DATASETNAME="SET_curcommlist" COLNAME="RDRZIP" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="1">RDRZIP</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨24" LEFT="456.12598" TOP="16.0" WIDTH="344.12598" HEIGHT="15.874016" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_SEPBKCLOS" DATASETNAME="SET_curcommlist" COLNAME="RDRADDRALL" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" INDEX_X="6" INDEX_Y="1">RDRADDRALL</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZBAND NAME="써머리 밴드1" TOP="92.0" WIDTH="801.6379" HEIGHT="28.0" BANDTYPE="8" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" IGNORENEWPAGE="false">
    <OZTABLESTATIC NAME="고정 테이블1" LEFT="632.0" TOP="7.0" WIDTH="166.39362" HEIGHT="14.173228">
      <OZTABLELABEL NAME="라벨18" WIDTH="78.393616" HEIGHT="14.173228" PAINTALLOW="1" FGCOLOR="-6750157" BGCOLOR="-13108" LEFT="632.0" TOP="7.0" INDEX_X="0" INDEX_Y="0" INDEX_W="1" INDEX_H="1">총계</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨19" LEFT="710.3936" WIDTH="88.0" HEIGHT="14.173228" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_SEPBKCLOS" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" EXP="SET_curcommlist.QTY.sum" FGCOLOR="-3407821" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2" RIGHTMARGIN="5.0" TOP="7.0" INDEX_X="1" INDEX_Y="0" INDEX_W="1" INDEX_H="1">SET_curcommlist.QTY.sum</OZTABLELABEL>
    </OZTABLESTATIC>
  </OZBAND>
  <OZBACKBAND NAME="배경1" WIDTH="801.6379" HEIGHT="544.8189" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_SEPBKCLOS" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_SEPBKCLOS.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_SEPBKCLOS" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_curcommlist" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="senddt" VALUE="20040911" />
	<PARAMFIELD FIELDNAME="sendmthd" VALUE="ALL" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

