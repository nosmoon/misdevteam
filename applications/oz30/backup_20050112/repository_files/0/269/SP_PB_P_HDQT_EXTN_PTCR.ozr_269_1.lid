OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="false" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="841.88983" PAPERHEIGHT="594.9921" SCRIPTBCE="false" VIRTUALX="1.15" VIRTUALY="1.15" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1097499315390" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="801.6379" HEIGHT="544.8189" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="더미 밴드1#%$oz*&amp;^데이터 밴드1" SRC="" />
  <OZBAND NAME="타이틀 밴드1" WIDTH="801.6379" HEIGHT="28.0" BANDTYPE="2" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨2" WIDTH="801.6379" HEIGHT="28.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="14" FONTSTYLE="1">본사 확장대회 수당지급 명세서</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="더미 밴드1" TOP="28.0" WIDTH="801.6379" HEIGHT="38.0" SCRIPTCODE="if (totalRowCount ( &quot;SP_PB_P_HDQT_EXTN_PTCR.SET_ov_hdqtcomscur&quot; ) == 0 ) {~OZ#CRLF    setattr (&quot;visable&quot;,&quot;true&quot;); ~OZ#CRLF}else{ ~OZ#CRLF    setattr (&quot;visable&quot;,&quot;false&quot;); ~OZ#CRLF}~OZ#CRLF" BANDTYPE="10" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="11" REPEATNUM="1" PAGEENDSTOP="false">
    <ONESHAPE NAME="라벨29" LEFT="56.0" TOP="16.0" WIDTH="86.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">독자번호</ONESHAPE>
    <ONESHAPE NAME="라벨30" LEFT="8.0" TOP="16.0" WIDTH="49.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">매체</ONESHAPE>
    <ONESHAPE NAME="라벨31" LEFT="144.0" TOP="16.0" WIDTH="76.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">독자명</ONESHAPE>
    <ONESHAPE NAME="라벨32" LEFT="224.0" TOP="16.0" WIDTH="64.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">구독기간</ONESHAPE>
    <ONESHAPE NAME="라벨33" LEFT="288.0" TOP="16.0" WIDTH="263.0" HEIGHT="17.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1" LEFTMARGIN="10.0">발송주소</ONESHAPE>
    <ONESHAPE NAME="라벨34" LEFT="552.0" TOP="16.0" WIDTH="77.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">전화번호</ONESHAPE>
    <ONESHAPE NAME="라벨35" LEFT="632.0" TOP="16.0" WIDTH="65.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">신청일</ONESHAPE>
    <ONESHAPE NAME="라벨36" LEFT="696.0" TOP="16.0" WIDTH="58.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">지급일자</ONESHAPE>
    <ONESHAPE NAME="라벨37" LEFT="744.0" TOP="16.0" WIDTH="57.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">지급내역</ONESHAPE>
    <OZLINE NAME="선11" TOP="10.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
    <OZLINE NAME="선12" TOP="36.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="66.0" WIDTH="801.6379" HEIGHT="54.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" MASTER="리포트1" DATASOURCENAME="Shadow_key" SUBDATALIST="데이터 밴드2" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨1" TOP="22.0" WIDTH="801.6379" HEIGHT="32.0" SCRIPTCODE="string extnfr;~OZ#CRLFstring extnto;~OZ#CRLFextnfr = substr(#SP_PB_P_HDQT_EXTN_PTCR.OZParam.extndtfr#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_HDQT_EXTN_PTCR.OZParam.extndtfr#, 4, 2)+&quot;/&quot;+substr(#SP_PB_P_HDQT_EXTN_PTCR.OZParam.extndtfr#, 6, 2) ;~OZ#CRLFextnto = substr(#SP_PB_P_HDQT_EXTN_PTCR.OZParam.extndtto#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_HDQT_EXTN_PTCR.OZParam.extndtto#, 4, 2)+&quot;/&quot;+substr(#SP_PB_P_HDQT_EXTN_PTCR.OZParam.extndtto#, 6, 2) ;~OZ#CRLF    ~OZ#CRLFstring closDate ;~OZ#CRLFclosDate = substr(#SP_PB_P_HDQT_EXTN_PTCR.OZParam.closmm#, 0, 4)+&quot; 년&quot;+ substr(#SP_PB_P_HDQT_EXTN_PTCR.OZParam.closmm#, 4, 2)+&quot; 월&quot; ;~OZ#CRLFsetattr(&quot;caption&quot;,&quot;부서명  :&quot;+#SP_PB_P_HDQT_EXTN_PTCR.Shadow_key.DEPTNM#~OZ#CRLF           +&quot;     사원번호 :&quot; +#SP_PB_P_HDQT_EXTN_PTCR.Shadow_key.HDQTEMP_NO#~OZ#CRLF           +&quot;     사원명 :&quot; +#SP_PB_P_HDQT_EXTN_PTCR.Shadow_key.EMPNM#~OZ#CRLF           +&quot;    수당마감월 : &quot;+closDate~OZ#CRLF           +&quot;    확장일자 :&quot;+extnfr+&quot;-&quot;+extnto ~OZ#CRLF        );" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
  </OZDATABAND>
  <OZBAND NAME="데이터 헤더밴드1" TOP="120.0" WIDTH="801.6379" HEIGHT="31.0" BANDTYPE="5" PARENT="데이터 밴드2" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="14">
    <OZLINE NAME="선1" WIDTH="800.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
    <OZLINE NAME="선2" TOP="3.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
    <OZLINE NAME="선3" TOP="26.0" WIDTH="800.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
    <OZLINE NAME="선4" TOP="26.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
    <OZLINE NAME="선5" TOP="29.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
    <ONESHAPE NAME="라벨3" TOP="6.0" WIDTH="49.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">매체</ONESHAPE>
    <ONESHAPE NAME="라벨4" LEFT="49.0" TOP="6.0" WIDTH="86.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">독자번호</ONESHAPE>
    <ONESHAPE NAME="라벨5" LEFT="139.0" TOP="6.0" WIDTH="76.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">독자명</ONESHAPE>
    <ONESHAPE NAME="라벨6" LEFT="216.0" TOP="6.0" WIDTH="64.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">구독기간</ONESHAPE>
    <ONESHAPE NAME="라벨7" LEFT="280.0" TOP="6.0" WIDTH="263.0" HEIGHT="17.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1" LEFTMARGIN="10.0">발송주소</ONESHAPE>
    <ONESHAPE NAME="라벨8" LEFT="544.0" TOP="6.0" WIDTH="77.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">전화번호</ONESHAPE>
    <ONESHAPE NAME="라벨9" LEFT="622.0" TOP="6.0" WIDTH="65.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">신청일</ONESHAPE>
    <ONESHAPE NAME="라벨10" LEFT="686.0" TOP="6.0" WIDTH="58.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">지급일자</ONESHAPE>
    <ONESHAPE NAME="라벨11" LEFT="744.0" TOP="6.0" WIDTH="57.0" HEIGHT="17.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">지급내역</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드2" TOP="151.0" WIDTH="801.6379" HEIGHT="47.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="데이터 헤더밴드1" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="18" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" MASTER="데이터 밴드1" DATASOURCENAME="Shadow_list" SUBDATALIST="데이터 밴드5" FIXEDTITLE="true" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="RDRNO" LEFT="48.0" WIDTH="88.0" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="RDRNO" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:RDRNO&gt;</ONESHAPE>
    <ONESHAPE NAME="MEDINM" WIDTH="48.0" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="MEDINM" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:MEDINM&gt;</ONESHAPE>
    <ONESHAPE NAME="RDRNM" LEFT="136.0" WIDTH="80.0" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="RDRNM" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:RDRNM&gt;</ONESHAPE>
    <ONESHAPE NAME="SUBS_NO" LEFT="216.0" WIDTH="64.0" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="SUBS_NO" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:SUBS_NO&gt;</ONESHAPE>
    <ONESHAPE NAME="DLVADDR" LEFT="280.0" WIDTH="264.0" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="DLVADDR" FORMAT_OPTION="normal#none" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1" LEFTMARGIN="10.0">&lt;Shadow_list:DLVADDR&gt;</ONESHAPE>
    <ONESHAPE NAME="RDRTEL_NO" LEFT="544.0" WIDTH="80.0" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="RDRTEL_NO" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:RDRTEL_NO&gt;</ONESHAPE>
    <ONESHAPE NAME="PAYDT" LEFT="688.0" WIDTH="56.0" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="PAYDT" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:PAYDT&gt;</ONESHAPE>
    <ONESHAPE NAME="ALONAMT" LEFT="744.0" WIDTH="57.63788" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="ALONAMT" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:ALONAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="APLCDT" LEFT="624.0" WIDTH="64.0" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="APLCDT" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:APLCDT&gt;</ONESHAPE>
    <ONESHAPE NAME="REALSELLAMT" LEFT="600.6378" TOP="20.0" WIDTH="39.63788" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="REALSELLAMT" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:REALSELLAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="RCPMAMT" LEFT="679.9136" TOP="20.0" WIDTH="39.63788" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="RCPMAMT" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;Shadow_list:RCPMAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="UNAMT" LEFT="759.18933" TOP="20.0" WIDTH="41.63788" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="Shadow_list" COLNAME="UNAMT" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">&lt;Shadow_list:UNAMT&gt;</ONESHAPE>
    <OZREGION NAME="리전1" LEFT="39.0" TOP="26.0" WIDTH="93.0" HEIGHT="17.0" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드4" SRC="" BINDTYPE="5" HGAP="0.0" VGAP="0.0">
      <OZDATABAND NAME="데이터 밴드4" WIDTH="93.0" HEIGHT="2.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" MASTER="리전1" DATASOURCENAME="Shadow_list" SUBDATALIST="데이터 밴드3" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true" />
      <OZDATABAND NAME="데이터 밴드3" TOP="2.0" WIDTH="93.0" HEIGHT="17.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="2" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" MASTER="데이터 밴드4" DATASOURCENAME="SET_ov_hdqtrecpcur" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
	<ONESHAPE NAME="RECPDT" LEFT="43.0" WIDTH="50.0" HEIGHT="16.0" SCRIPTCODE="setattr(&quot;caption&quot;,&quot;(&quot;+#SP_PB_P_HDQT_EXTN_PTCR.SET_ov_hdqtrecpcur.RECPDT#+&quot;)&quot;);" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtrecpcur" COLNAME="RECPDT" FORMAT_OPTION="normal#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtrecpcur:RECPDT&gt;</ONESHAPE>
	<ONESHAPE NAME="RCPMAMT1" LEFT="1.0" WIDTH="44.0" HEIGHT="16.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtrecpcur" COLNAME="RCPMAMT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">&lt;SET_ov_hdqtrecpcur:RCPMAMT&gt;</ONESHAPE>
      </OZDATABAND>
    </OZREGION>
    <ONESHAPE NAME="라벨12" LEFT="561.0" TOP="20.0" WIDTH="39.63788" HEIGHT="24.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">약정총액:</ONESHAPE>
    <ONESHAPE NAME="라벨13" LEFT="640.27576" TOP="20.0" WIDTH="39.63788" HEIGHT="24.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">수금총액:</ONESHAPE>
    <ONESHAPE NAME="라벨14" LEFT="719.5515" TOP="20.0" WIDTH="39.63788" HEIGHT="24.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">미수금액:</ONESHAPE>
    <ONESHAPE NAME="라벨15" TOP="22.0" WIDTH="38.63788" HEIGHT="24.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">수금내역:</ONESHAPE>
    <OZLINE NAME="선6" TOP="45.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
  </OZDATABAND>
  <OZDATABAND NAME="데이터 밴드5" TOP="198.0" WIDTH="801.6379" HEIGHT="90.14174" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="데이터 풋터밴드1" HEADERDUMMY="" FOOTERDUMMY="" COUNT="37" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" MASTER="데이터 밴드2" DATASOURCENAME="SET_ov_hdqtsubcur" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="WEEKPAYNOIT" LEFT="112.0" TOP="4.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="WEEKPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:WEEKPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="MONPAYNOIT" LEFT="248.00002" TOP="4.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="MONPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:MONPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="MTPAYNOIT" LEFT="376.0" TOP="4.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="MTPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:MTPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="FISHPAYNOIT" LEFT="520.0" TOP="4.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="FISHPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:FISHPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="WOMPAYNOIT" LEFT="640.0" TOP="4.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="WOMPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:WOMPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="TEPSPAYNOIT" LEFT="759.11816" TOP="4.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="TEPSPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:TEPSPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="COUNT(RDR_NO)--전체생산건" LEFT="112.0" TOP="61.0" WIDTH="42.519688" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="COUNT(RDR_NO)--전체생산건" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:COUNT(RDR_NO)--전체생산건&gt;</ONESHAPE>
    <ONESHAPE NAME="PAYNOIT" LEFT="248.00002" TOP="61.0" WIDTH="42.519688" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="PAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:PAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="PAYTOT_AMT" LEFT="376.0" TOP="61.0" WIDTH="42.519688" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="PAYTOT_AMT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:PAYTOT_AMT&gt;</ONESHAPE>
    <ONESHAPE NAME="INCM_TAX" LEFT="520.0" TOP="61.0" WIDTH="42.519688" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="INCM_TAX" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:INCM_TAX&gt;</ONESHAPE>
    <ONESHAPE NAME="PRN_TAX" LEFT="640.0" TOP="61.0" WIDTH="42.519688" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="PRN_TAX" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:PRN_TAX&gt;</ONESHAPE>
    <ONESHAPE NAME="SUM_TAX" LEFT="759.0" TOP="61.0" WIDTH="42.519688" HEIGHT="24.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="SUM_TAX" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:SUM_TAX&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨16" TOP="4.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">지급건수:</ONESHAPE>
    <ONESHAPE NAME="라벨17" LEFT="64.0" TOP="4.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">주간조선:</ONESHAPE>
    <ONESHAPE NAME="라벨18" LEFT="200.0" TOP="4.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">월간조선:</ONESHAPE>
    <ONESHAPE NAME="라벨19" LEFT="328.0" TOP="4.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">월간산:</ONESHAPE>
    <ONESHAPE NAME="라벨20" LEFT="472.0" TOP="4.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">월간낚시:</ONESHAPE>
    <ONESHAPE NAME="라벨21" LEFT="592.0" TOP="4.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">여성조선:</ONESHAPE>
    <ONESHAPE NAME="라벨22" LEFT="712.0" TOP="4.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">T E P S:</ONESHAPE>
    <OZLINE NAME="선8" TOP="24.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
    <ONESHAPE NAME="라벨23" LEFT="50.0" TOP="65.0" WIDTH="58.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">전체생산건수:</ONESHAPE>
    <ONESHAPE NAME="라벨24" LEFT="186.0" TOP="62.0" WIDTH="58.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">수당지급건수:</ONESHAPE>
    <ONESHAPE NAME="라벨25" LEFT="310.0" TOP="62.0" WIDTH="58.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">수당지급액:</ONESHAPE>
    <ONESHAPE NAME="라벨26" LEFT="476.0" TOP="62.0" WIDTH="44.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">소득세:</ONESHAPE>
    <ONESHAPE NAME="라벨27" LEFT="596.0" TOP="62.0" WIDTH="44.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">주민세:</ONESHAPE>
    <ONESHAPE NAME="라벨28" LEFT="712.0" TOP="62.0" WIDTH="46.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">세액합계:</ONESHAPE>
    <OZLINE NAME="선10" TOP="86.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
    <ONESHAPE NAME="라벨38" LEFT="114.0" TOP="28.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="WVILLAGEPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:WVILLAGEPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨39" LEFT="250.00002" TOP="28.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="ENNOBLEPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:ENNOBLEPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨40" LEFT="378.0" TOP="28.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="GENGKANPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:GENGKANPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨41" LEFT="527.0" TOP="28.0" WIDTH="42.519688" HEIGHT="20.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_HDQT_EXTN_PTCR" DATASETNAME="SET_ov_hdqtsubcur" COLNAME="ECONOMYPAYNOIT" FORMAT="#,###;(#,###)" FORMAT_OPTION="number#NB" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">&lt;SET_ov_hdqtsubcur:ECONOMYPAYNOIT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨44" LEFT="66.0" TOP="28.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">W.Village:</ONESHAPE>
    <ONESHAPE NAME="라벨45" LEFT="202.0" TOP="28.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">ENNOBLE:</ONESHAPE>
    <ONESHAPE NAME="라벨46" LEFT="330.0" TOP="28.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">징기스칸:</ONESHAPE>
    <ONESHAPE NAME="라벨47" LEFT="474.0" TOP="28.0" WIDTH="48.0" HEIGHT="20.0" PAINTALLOW="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">Economy Plus:</ONESHAPE>
    <OZLINE NAME="선13" TOP="24.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
    <OZLINE NAME="선14" TOP="48.0" WIDTH="801.6379" HEIGHT="2.0" DASH="1.0" GAP="1.0" />
  </OZDATABAND>
  <OZBAND NAME="데이터 풋터밴드1" TOP="288.14172" WIDTH="801.6379" HEIGHT="2.0" BANDTYPE="7" PARENT="데이터 밴드5" FORCENEWPAGE="true" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZBACKBAND NAME="배경1" WIDTH="801.6379" HEIGHT="544.8189" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_HDQT_EXTN_PTCR" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_HDQT_EXTN_PTCR.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_HDQT_EXTN_PTCR" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_hdqtcomscur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_SP_PB_P_HDQT_EXTN_PTCR_SUB" MASTERSET="Shadow_list" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_hdqtsubcur" MASTERSET="Shadow_list" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_SP_PB_P_HDQT_EXTN_PTCR_RECP" MASTERSET="Shadow_list" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_ov_hdqtrecpcur" MASTERSET="Shadow_list" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_key" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_list" MASTERSET="Shadow_key" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="closmm" VALUE="200407" />
	<PARAMFIELD FIELDNAME="extndtfr" VALUE="20040701" />
	<PARAMFIELD FIELDNAME="extndtto" VALUE="20040705" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

