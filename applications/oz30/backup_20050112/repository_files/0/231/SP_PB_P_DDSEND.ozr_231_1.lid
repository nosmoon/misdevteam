OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="56.692913" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="594.9921" PAPERHEIGHT="841.88983" SCRIPTBCE="false" VIRTUALX="0.97749996" VIRTUALY="0.97749996" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1104124391765" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="554.7402" HEIGHT="765.0709" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="더미 밴드1#%$oz*&amp;^데이터 밴드1" SRC="" />
  <OZBAND NAME="페이지 헤더밴드1" WIDTH="554.7402" HEIGHT="29.0" BANDTYPE="1" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" FIRSTPAGESKIP="false">
    <ONESHAPE NAME="라벨4" WIDTH="554.7401" HEIGHT="29.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="12" FONTNAME="굴림체" FONTSTYLE="1">매체 일일발송 리스트</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="더미 밴드1" TOP="29.0" WIDTH="554.7402" HEIGHT="42.0" SCRIPTCODE="if (totalRowCount ( &quot;SP_PB_P_DDSEND.SET_curcommlist&quot; ) == 0 ) {~OZ#CRLF    setattr (&quot;visable&quot;,&quot;true&quot;); ~OZ#CRLF}else{ ~OZ#CRLF    setattr (&quot;visable&quot;,&quot;false&quot;); ~OZ#CRLF}" BANDTYPE="10" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="9" REPEATNUM="1" PAGEENDSTOP="false">
    <ONESHAPE NAME="라벨1" LEFT="24.0" TOP="27.0" WIDTH="64.0" HEIGHT="14.87402" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">독자번호</ONESHAPE>
    <ONESHAPE NAME="라벨2" LEFT="88.0" TOP="27.0" WIDTH="64.0" HEIGHT="14.87402" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">성명</ONESHAPE>
    <ONESHAPE NAME="라벨3" LEFT="152.0" TOP="27.0" WIDTH="64.0" HEIGHT="14.87402" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">전화번호</ONESHAPE>
    <ONESHAPE NAME="라벨5" LEFT="216.0" TOP="27.0" WIDTH="56.0" HEIGHT="14.87402" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">구독호수</ONESHAPE>
    <ONESHAPE NAME="라벨6" LEFT="352.0" TOP="27.0" WIDTH="201.0" HEIGHT="14.87402" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">주소</ONESHAPE>
    <ONESHAPE NAME="라벨7" LEFT="272.0" TOP="27.0" WIDTH="40.0" HEIGHT="14.87402" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">발송호수</ONESHAPE>
    <ONESHAPE NAME="라벨9" TOP="27.0" WIDTH="24.0" HEIGHT="14.87402" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">순번</ONESHAPE>
    <ONESHAPE NAME="라벨8" TOP="8.0" WIDTH="460.34647" HEIGHT="12.0" SCRIPTCODE="string sedndate ;~OZ#CRLF~OZ#CRLFsedndate = substr(#SP_PB_P_DDSEND.OZParam.senddt#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_DDSEND.OZParam.senddt#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_DDSEND.OZParam.senddt#, 6, 2) ;~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;,&quot;발송일자 : &quot;+sedndate~OZ#CRLF                          +&quot;   매체명 : &quot;+#SP_PB_P_DDSEND.SET_SP_PB_P_DDSEND.ov_medinm#~OZ#CRLF                          +&quot;   마감호수 : &quot;+#SP_PB_P_DDSEND.OZParam.mediser_no#~OZ#CRLF                          +&quot;   발송방법 : &quot;+#SP_PB_P_DDSEND.SET_SP_PB_P_DDSEND.ov_sendmthdnm#~OZ#CRLF                          +&quot;   발송종류 : &quot;+#SP_PB_P_DDSEND.SET_SP_PB_P_DDSEND.ov_sendkindnm#                 ~OZ#CRLF            );" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨30" LEFT="312.0" TOP="27.0" WIDTH="40.0" HEIGHT="14.87402" PAINTALLOW="1" FORMAT_OPTION="normal#none" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체">우편번호</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="데이터 헤더밴드1" TOP="71.0" WIDTH="554.7402" HEIGHT="28.12598" BANDTYPE="5" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="3">
    <ONESHAPE NAME="라벨28" TOP="7.1259766" WIDTH="460.34647" HEIGHT="13.811035" SCRIPTCODE="string sedndate ;~OZ#CRLF~OZ#CRLFsedndate = substr(#SP_PB_P_DDSEND.OZParam.senddt#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_DDSEND.OZParam.senddt#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_DDSEND.OZParam.senddt#, 6, 2) ;~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;,&quot;발송일자 : &quot;+sedndate~OZ#CRLF                          +&quot;   매체명 : &quot;+#SP_PB_P_DDSEND.SET_SP_PB_P_DDSEND.ov_medinm#~OZ#CRLF                          +&quot;   마감호수 : &quot;+#SP_PB_P_DDSEND.OZParam.mediser_no#~OZ#CRLF                          +&quot;   발송방법 : &quot;+#SP_PB_P_DDSEND.SET_SP_PB_P_DDSEND.ov_sendmthdnm#~OZ#CRLF                          +&quot;   발송종류 : &quot;+#SP_PB_P_DDSEND.SET_SP_PB_P_DDSEND.ov_sendkindnm#                 ~OZ#CRLF            );" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨26" LEFT="496.0" TOP="7.1259766" WIDTH="26.748016" HEIGHT="13.811035" SCRIPTCODE="setattr(&quot;caption&quot;,#OZSystem.Page_Number#+&quot;  / &quot;);" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2"></ONESHAPE>
    <ONESHAPE NAME="라벨29" LEFT="528.0" TOP="7.1259766" WIDTH="23.811035" HEIGHT="13.811035" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="99.12598" WIDTH="554.7402" HEIGHT="28.874023" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="데이터 헤더밴드1" FOOTERBANDNAME="데이터 풋터밴드1" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_DDSEND" MASTER="리포트1" DATASOURCENAME="SET_curcommlist" SUBDATALIST="" FIXEDTITLE="true" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블1" WIDTH="553.16504" HEIGHT="28.346462" ODINAME="SP_PB_P_DDSEND" DATASET="SET_curcommlist" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="true" SELLABEL="RDR_NO#%$oz*&amp;^RDRNM#%$oz*&amp;^RDRTEL#%$oz*&amp;^SUBSNO#%$oz*&amp;^MEDISER_NO#%$oz*&amp;^DLVZIP#%$oz*&amp;^ADDR" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="true">
      <OZTTLABEL NAME="라벨10" WIDTH="20.196533" HEIGHT="14.173233" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="0">순번</OZTTLABEL>
      <OZTTLABEL NAME="라벨11" LEFT="20.196533" WIDTH="81.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="RDR_NO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="0">독자번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨12" LEFT="101.19653" WIDTH="72.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="RDRNM" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="0">성명</OZTTLABEL>
      <OZTTLABEL NAME="라벨13" LEFT="173.19653" WIDTH="64.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="RDRTEL" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="0">전화번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨14" LEFT="237.19653" WIDTH="56.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="SUBSNO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="0">구독호수</OZTTLABEL>
      <OZTTLABEL NAME="라벨15" LEFT="293.19653" WIDTH="36.566925" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="MEDISER_NO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="0">발송호수</OZTTLABEL>
      <OZTTLABEL NAME="라벨16" LEFT="329.76346" WIDTH="39.40158" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="DLVZIP" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="6" INDEX_Y="0">우편번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨18" LEFT="369.16504" WIDTH="184.0" HEIGHT="14.173233" PAINTALLOW="1" COLNAME="ADDR" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="7" INDEX_Y="0">주소</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨17" TOP="14.173233" WIDTH="20.196533" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_DDSEND" DATASETNAME="SET_curcommlist" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="1"></OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨19" LEFT="20.196533" TOP="14.173233" WIDTH="81.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_DDSEND" DATASETNAME="SET_curcommlist" COLNAME="RDR_NO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="1">RDR_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨21" LEFT="101.19653" TOP="14.173233" WIDTH="72.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_DDSEND" DATASETNAME="SET_curcommlist" COLNAME="RDRNM" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" WORDWRAP="true" INDEX_X="2" INDEX_Y="1">RDRNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨20" LEFT="173.19653" TOP="14.173233" WIDTH="64.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_DDSEND" DATASETNAME="SET_curcommlist" COLNAME="RDRTEL" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="1">RDRTEL</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨22" LEFT="237.19653" TOP="14.173233" WIDTH="56.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_DDSEND" DATASETNAME="SET_curcommlist" COLNAME="SUBSNO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="1">SUBSNO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨25" LEFT="293.19653" TOP="14.173233" WIDTH="36.566925" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_DDSEND" DATASETNAME="SET_curcommlist" COLNAME="MEDISER_NO" FONTSIZE="8" FONTNAME="굴림체" WORDWRAP="true" INDEX_X="5" INDEX_Y="1">MEDISER_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨23" LEFT="329.76346" TOP="14.173233" WIDTH="39.40158" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_DDSEND" DATASETNAME="SET_curcommlist" COLNAME="DLVZIP" FONTSIZE="8" FONTNAME="굴림체" WORDWRAP="true" INDEX_X="6" INDEX_Y="1">DLVZIP</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨27" LEFT="369.16504" TOP="14.173233" WIDTH="184.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_DDSEND" DATASETNAME="SET_curcommlist" COLNAME="ADDR" FORMAT_OPTION="normal#none" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" LEFTMARGIN="5.0" INDEX_X="7" INDEX_Y="1">ADDR</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZBAND NAME="데이터 풋터밴드1" TOP="128.0" WIDTH="554.7402" HEIGHT="32.0" BANDTYPE="7" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨24" LEFT="440.0" TOP="8.0" WIDTH="112.0" HEIGHT="16.0" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;총 계 : &quot;+#SP_PB_P_DDSEND.SET_SP_PB_P_DDSEND.ov_rdrcnt#  );" PAINTALLOW="1"></ONESHAPE>
  </OZBAND>
  <OZBACKBAND NAME="배경1" WIDTH="554.7402" HEIGHT="765.0709" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_DDSEND" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_DDSEND.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_DDSEND" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_curcommlist" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="bocd" VALUE="b0405" />
	<PARAMFIELD FIELDNAME="senddt" VALUE="20041222" />
	<PARAMFIELD FIELDNAME="mediser_no" VALUE="1811" />
	<PARAMFIELD FIELDNAME="sendmthdcd" VALUE="10" />
	<PARAMFIELD FIELDNAME="medicd" VALUE="210" />
	<PARAMFIELD FIELDNAME="sendkindcd" VALUE="01" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

