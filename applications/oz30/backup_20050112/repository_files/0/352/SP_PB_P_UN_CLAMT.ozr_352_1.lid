OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="false" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="841.88983" PAPERHEIGHT="594.9921" SCRIPTBCE="false" VIRTUALX="0.8527414" VIRTUALY="0.8527414" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1091189782125" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="10" FONTNAME="Dialog" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="801.6379" HEIGHT="544.8189" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="더미 밴드1#%$oz*&amp;^데이터 밴드1" SRC="" />
  <OZBAND NAME="타이틀 밴드1" WIDTH="801.6379" HEIGHT="28.0" SCRIPTCODE="global int cnt1 ;" BANDTYPE="2" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨1" WIDTH="800.0" HEIGHT="28.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="15" FONTNAME="굴림체" FONTSTYLE="1">미수금원장</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="더미 밴드1" TOP="28.0" WIDTH="801.6379" HEIGHT="48.0" SCRIPTCODE="if (totalRowCount ( &quot;SP_PB_P_UN_CLAMT.Shadow_Master&quot; ) == 0 ) {~OZ#CRLF    setattr (&quot;visable&quot;,&quot;true&quot;); ~OZ#CRLF}else{ ~OZ#CRLF    setattr (&quot;visable&quot;,&quot;false&quot;); ~OZ#CRLF}" BANDTYPE="10" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="6" REPEATNUM="1" PAGEENDSTOP="false">
    <ONESHAPE NAME="라벨2" LEFT="10.0" TOP="9.0" WIDTH="56.0" HEIGHT="15.0" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">입금일자 : </ONESHAPE>
    <ONESHAPE NAME="라벨3" LEFT="58.0" TOP="9.0" WIDTH="80.0" HEIGHT="15.0" SCRIPTCODE="string wDate;~OZ#CRLFwDate = #SP_PB_P_UN_CLAMT.SET_sp_pb_p_un_clamt.ov_sysdate#;~OZ#CRLFsetattr(&quot;caption&quot;, wDate);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0"></ONESHAPE>
    <ONESHAPE NAME="라벨4" LEFT="144.0" TOP="9.0" WIDTH="48.0" HEIGHT="15.0" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">매체명 : </ONESHAPE>
    <ONESHAPE NAME="라벨5" LEFT="192.0" TOP="9.0" WIDTH="72.0" HEIGHT="15.0" SCRIPTCODE="string str;~OZ#CRLFstr = #SP_PB_P_UN_CLAMT.SET_sp_pb_p_un_clamt.ov_medinm#;~OZ#CRLFsetattr(&quot;caption&quot;, str);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨6" LEFT="277.0" TOP="9.0" WIDTH="48.0" HEIGHT="15.0" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">관리사원 : </ONESHAPE>
    <OZTABLESTATIC NAME="고정 테이블1" TOP="28.0" WIDTH="800.0" HEIGHT="14.0">
      <OZTABLELABEL NAME="라벨8" WIDTH="24.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" LEFT="0.0" TOP="28.0" INDEX_X="0" INDEX_Y="0" INDEX_W="1" INDEX_H="1">순번</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨9" LEFT="24.0" WIDTH="88.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="1" INDEX_Y="0" INDEX_W="1" INDEX_H="1">독자번호</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨10" LEFT="112.0" WIDTH="80.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="2" INDEX_Y="0" INDEX_W="1" INDEX_H="1">수취인명</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨11" LEFT="192.0" WIDTH="56.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="3" INDEX_Y="0" INDEX_W="1" INDEX_H="1">신청일자</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨12" LEFT="248.0" WIDTH="64.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="4" INDEX_Y="0" INDEX_W="1" INDEX_H="1">구독기간</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨13" LEFT="312.0" WIDTH="72.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="5" INDEX_Y="0" INDEX_W="1" INDEX_H="1">전화번호</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨14" LEFT="384.0" WIDTH="192.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="6" INDEX_Y="0" INDEX_W="1" INDEX_H="1">주소</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨15" LEFT="576.0" WIDTH="40.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="7" INDEX_Y="0" INDEX_W="1" INDEX_H="1">영업사원</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨16" LEFT="616.0" WIDTH="48.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="8" INDEX_Y="0" INDEX_W="1" INDEX_H="1">판매금액</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨17" LEFT="664.0" WIDTH="48.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="9" INDEX_Y="0" INDEX_W="1" INDEX_H="1">수금액</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨18" LEFT="712.0" WIDTH="48.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="10" INDEX_Y="0" INDEX_W="1" INDEX_H="1">미수금액</OZTABLELABEL>
      <OZTABLELABEL NAME="라벨19" LEFT="760.0" WIDTH="40.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" TOP="28.0" INDEX_X="11" INDEX_Y="0" INDEX_W="1" INDEX_H="1">발송여부</OZTABLELABEL>
    </OZTABLESTATIC>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="76.0" WIDTH="801.6379" HEIGHT="30.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="8" ODINAME="SP_PB_P_UN_CLAMT" MASTER="리포트1" DATASOURCENAME="Shadow_Master" SUBDATALIST="데이터 밴드2" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨43" LEFT="8.0" TOP="8.976379" WIDTH="56.0" HEIGHT="15.023622" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">입금일자 : </ONESHAPE>
    <ONESHAPE NAME="라벨44" LEFT="56.0" TOP="8.976379" WIDTH="80.0" HEIGHT="15.023622" SCRIPTCODE="string wDate;~OZ#CRLFwDate = #SP_PB_P_UN_CLAMT.SET_sp_pb_p_un_clamt.ov_sysdate#;~OZ#CRLFsetattr(&quot;caption&quot;, wDate);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0"></ONESHAPE>
    <ONESHAPE NAME="라벨45" LEFT="139.0" TOP="8.976379" WIDTH="48.0" HEIGHT="15.023622" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">매체명 : </ONESHAPE>
    <ONESHAPE NAME="라벨46" LEFT="187.0" TOP="8.976379" WIDTH="86.0" HEIGHT="15.023622" SCRIPTCODE="string str;~OZ#CRLFstr = #SP_PB_P_UN_CLAMT.SET_sp_pb_p_un_clamt.ov_medinm#;~OZ#CRLFsetattr(&quot;caption&quot;, str);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨47" LEFT="275.0" TOP="8.976379" WIDTH="48.0" HEIGHT="15.023622" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">관리사원 : </ONESHAPE>
    <ONESHAPE NAME="라벨48" LEFT="315.0" TOP="8.976379" WIDTH="80.0" HEIGHT="15.023622" SCRIPTCODE="string mEmp;~OZ#CRLFmEmp = #SP_PB_P_UN_CLAMT.Shadow_Master.MANG_EMPNM#;~OZ#CRLFsetattr(&quot;caption&quot;, mEmp);" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨62" LEFT="766.0" TOP="8.976379" WIDTH="35.63788" HEIGHT="15.023622" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨63" LEFT="732.0" TOP="8.976379" WIDTH="32.0" HEIGHT="15.023622" SCRIPTCODE="setattr(&quot;caption&quot;,#OZSystem.Page_Number#+&quot;  / &quot;);" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" FORMAT_OPTION="normal#none" NOFRAME="true" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
  </OZDATABAND>
  <OZDATABAND NAME="데이터 밴드2" TOP="106.0" WIDTH="801.6379" HEIGHT="28.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="데이터 풋터밴드1" HEADERDUMMY="" FOOTERDUMMY="" COUNT="2" ODINAME="SP_PB_P_UN_CLAMT" MASTER="데이터 밴드1" DATASOURCENAME="Shadow_Detail" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZREGION NAME="리전1" WIDTH="800.0" HEIGHT="20.0" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드3" SRC="" BINDTYPE="3" HGAP="0.0" VGAP="0.0">
      <OZDATABAND NAME="데이터 밴드3" WIDTH="800.0" HEIGHT="20.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" ODINAME="SP_PB_P_UN_CLAMT" MASTER="리전1" DATASOURCENAME="Shadow_Detail" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true" />
    </OZREGION>
    <OZTable NAME="테이블1" WIDTH="800.0" HEIGHT="28.0" ODINAME="SP_PB_P_UN_CLAMT" DATASET="Shadow_Detail" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="true" SELLABEL="RDR_NO#%$oz*&amp;^APLCDT#%$oz*&amp;^ACQNM#%$oz*&amp;^SUBS_PRD#%$oz*&amp;^RDRTEL#%$oz*&amp;^ADDR#%$oz*&amp;^AMNM#%$oz*&amp;^REALSELLAMT#%$oz*&amp;^RCPMAMT#%$oz*&amp;^UNCLAMT#%$oz*&amp;^SENDYNNM" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="true">
      <OZTTLABEL NAME="라벨7" WIDTH="24.0" HEIGHT="14.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="0">순번</OZTTLABEL>
      <OZTTLABEL NAME="라벨28" LEFT="24.0" WIDTH="88.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="RDR_NO" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="0">독자번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨30" LEFT="112.0" WIDTH="56.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="APLCDT" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="0">신청일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨29" LEFT="168.0" WIDTH="80.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="ACQNM" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="3" INDEX_Y="0">수취인명</OZTTLABEL>
      <OZTTLABEL NAME="라벨31" LEFT="248.0" WIDTH="64.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="SUBS_PRD" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="0">구독기간</OZTTLABEL>
      <OZTTLABEL NAME="라벨32" LEFT="312.0" WIDTH="72.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="RDRTEL" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="0">전화번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨33" LEFT="384.0" WIDTH="192.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="ADDR" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="6" INDEX_Y="0">주소</OZTTLABEL>
      <OZTTLABEL NAME="라벨34" LEFT="576.0" WIDTH="40.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="AMNM" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="7" INDEX_Y="0">영업사원</OZTTLABEL>
      <OZTTLABEL NAME="라벨41" LEFT="616.0" WIDTH="48.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="REALSELLAMT" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="8" INDEX_Y="0">판매금액</OZTTLABEL>
      <OZTTLABEL NAME="라벨42" LEFT="664.0" WIDTH="48.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="RCPMAMT" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="9" INDEX_Y="0">수금액</OZTTLABEL>
      <OZTTLABEL NAME="라벨49" LEFT="712.0" WIDTH="48.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="UNCLAMT" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="10" INDEX_Y="0">미수금액</OZTTLABEL>
      <OZTTLABEL NAME="라벨50" LEFT="760.0" WIDTH="40.0" HEIGHT="14.0" PAINTALLOW="1" COLNAME="SENDYNNM" BGCOLOR="-3355393" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="11" INDEX_Y="0">발송여부</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨52" TOP="14.0" WIDTH="24.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="0" INDEX_Y="1"></OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨51" LEFT="24.0" TOP="14.0" WIDTH="88.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="RDR_NO" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="1" INDEX_Y="1">RDR_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨54" LEFT="112.0" TOP="14.0" WIDTH="56.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="APLCDT" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="2" INDEX_Y="1">APLCDT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨53" LEFT="168.0" TOP="14.0" WIDTH="80.0" HEIGHT="14.0" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="ACQNM" FONTNAME="굴림체" WORDWRAP="true" INDEX_X="3" INDEX_Y="1">ACQNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨55" LEFT="248.0" TOP="14.0" WIDTH="64.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="SUBS_PRD" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="4" INDEX_Y="1">SUBS_PRD</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨56" LEFT="312.0" TOP="14.0" WIDTH="72.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="RDRTEL" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="5" INDEX_Y="1">RDRTEL</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨57" LEFT="384.0" TOP="14.0" WIDTH="192.0" HEIGHT="14.0" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="ADDR" FONTSIZE="8" FONTNAME="굴림체" HALIGN="1" WORDWRAP="true" INDEX_X="6" INDEX_Y="1">ADDR</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨58" LEFT="576.0" TOP="14.0" WIDTH="40.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="AMNM" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="7" INDEX_Y="1">AMNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨59" LEFT="616.0" TOP="14.0" WIDTH="48.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="REALSELLAMT" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2" INDEX_X="8" INDEX_Y="1">REALSELLAMT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨60" LEFT="664.0" TOP="14.0" WIDTH="48.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="RCPMAMT" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2" INDEX_X="9" INDEX_Y="1">RCPMAMT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨61" LEFT="712.0" TOP="14.0" WIDTH="48.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="UNCLAMT" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" FONTSIZE="8" FONTNAME="굴림체" HALIGN="2" INDEX_X="10" INDEX_Y="1">UNCLAMT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨64" LEFT="760.0" TOP="14.0" WIDTH="40.0" HEIGHT="14.0" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" DATASETNAME="Shadow_Detail" COLNAME="SENDYNNM" FONTSIZE="8" FONTNAME="굴림체" INDEX_X="11" INDEX_Y="1">SENDYNNM</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZBAND NAME="데이터 풋터밴드1" TOP="134.0" WIDTH="801.6379" HEIGHT="50.0" SCRIPTCODE="::cnt1 = 0;" BANDTYPE="7" PARENT="데이터 밴드2" FORCENEWPAGE="true" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="7">
    <ONESHAPE NAME="라벨40" WIDTH="800.0" HEIGHT="32.0" PAINTALLOW="1" FONTNAME="굴림체"></ONESHAPE>
    <ONESHAPE NAME="라벨21" LEFT="700.0" TOP="6.0" WIDTH="90.0" HEIGHT="17.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" FORMAT="###,###,###,##0" EXP="Shadow_Detail.UNCLAMT.sum" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1">Shadow_Detail.UNCLAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨35" LEFT="320.0" TOP="6.0" WIDTH="43.0" HEIGHT="17.0" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">약정합계 : </ONESHAPE>
    <ONESHAPE NAME="라벨36" LEFT="363.0" TOP="6.0" WIDTH="90.0" HEIGHT="17.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" FORMAT="###,###,##0" EXP="Shadow_Detail.REALSELLAMT.sum" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1">Shadow_Detail.REALSELLAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨37" LEFT="656.0" TOP="6.0" WIDTH="44.0" HEIGHT="17.0" PAINTALLOW="1" EXP="미수합계 : " FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">미수금 : </ONESHAPE>
    <ONESHAPE NAME="라벨38" LEFT="531.0" TOP="6.0" WIDTH="90.0" HEIGHT="17.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" FORMAT="###,###,###,##0" EXP="Shadow_Detail.RCPMAMT.sum" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1">Shadow_Detail.RCPMAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨39" LEFT="490.0" TOP="6.0" WIDTH="41.0" HEIGHT="17.0" PAINTALLOW="1" EXP="미수합계 : " FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">수금합계 : </ONESHAPE>
  </OZBAND>
  <OZBAND NAME="써머리 밴드1" TOP="184.0" WIDTH="801.6379" HEIGHT="88.0" BANDTYPE="8" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="7" IGNORENEWPAGE="false">
    <ONESHAPE NAME="라벨20" TOP="8.0" WIDTH="800.0" HEIGHT="64.0" PAINTALLOW="1" FONTNAME="굴림체"></ONESHAPE>
    <ONESHAPE NAME="라벨22" LEFT="711.6379" TOP="16.0" WIDTH="90.0" HEIGHT="17.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" FORMAT="###,###,###,##0" EXP="Shadow_Detail.UNCLAMT.sum" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1">Shadow_Detail.UNCLAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨23" LEFT="328.0" TOP="16.0" WIDTH="43.0" HEIGHT="17.0" PAINTALLOW="1" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">약정합계 : </ONESHAPE>
    <ONESHAPE NAME="라벨24" LEFT="368.0" TOP="16.0" WIDTH="90.0" HEIGHT="17.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" FORMAT="###,###,##0" EXP="Shadow_Detail.REALSELLAMT.sum" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1">Shadow_Detail.REALSELLAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨25" LEFT="664.0" TOP="16.0" WIDTH="44.0" HEIGHT="17.0" PAINTALLOW="1" EXP="미수합계 : " FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">미수금 : </ONESHAPE>
    <ONESHAPE NAME="라벨26" LEFT="536.0" TOP="16.0" WIDTH="90.0" HEIGHT="17.0" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_PB_P_UN_CLAMT" FORMAT="###,###,###,##0" EXP="Shadow_Detail.RCPMAMT.sum" FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1">Shadow_Detail.RCPMAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨27" LEFT="496.0" TOP="16.0" WIDTH="41.0" HEIGHT="17.0" PAINTALLOW="1" EXP="미수합계 : " FONTSIZE="8" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">수금합계 : </ONESHAPE>
  </OZBAND>
  <OZBACKBAND NAME="배경1" WIDTH="801.6379" HEIGHT="544.8189" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="Dialog" FONTFAMILY="dialog" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_UN_CLAMT" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_UN_CLAMT.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_sp_pb_p_un_clamt" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_clamt_list" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_Master" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_Detail" MASTERSET="Shadow_Master" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="iv_bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="iv_medicd" VALUE="230" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

