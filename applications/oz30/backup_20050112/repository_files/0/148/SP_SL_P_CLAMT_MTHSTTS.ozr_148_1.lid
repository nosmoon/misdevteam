OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="56.692913" LEFTMARGIN="17.007874" BOTTOMMARGIN="56.692913" RIGHTMARGIN="17.007874" PAPERSIZE="1" PAPERWIDTH="594.9921" PAPERHEIGHT="841.88983" SCRIPTBCE="false" VIRTUALX="1.3225" VIRTUALY="1.3225" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1088076465281" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="8" FONTNAME="굴림" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="560.9764" HEIGHT="728.50397" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드1" SRC="" />
  <OZBAND NAME="페이지 헤더밴드1" WIDTH="560.9764" HEIGHT="71.03937" BANDTYPE="1" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="27" FIRSTPAGESKIP="false">
    <ONESHAPE NAME="라벨1" WIDTH="560.9764" HEIGHT="28.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="15" FONTNAME="굴림체" FONTSTYLE="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">수금방법별현황</ONESHAPE>
    <ONESHAPE NAME="라벨3" LEFT="413.0" TOP="28.999998" WIDTH="65.60629" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="9" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">출력일자 : </ONESHAPE>
    <ONESHAPE NAME="라벨4" LEFT="464.0" TOP="28.999998" WIDTH="96.97635" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Date" FORMAT="date_yyyy-MM-dd HH:mm" FORMAT_OPTION="date#B" FONTSIZE="9" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">&lt;OZSystem:Date&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨5" TOP="45.0" WIDTH="29.0" HEIGHT="26.0" PAINTALLOW="1" FONTNAME="굴림체">구역</ONESHAPE>
    <ONESHAPE NAME="라벨6" LEFT="28.999996" TOP="45.0" WIDTH="76.00001" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">지로</ONESHAPE>
    <ONESHAPE NAME="라벨13" LEFT="257.0" TOP="45.0" WIDTH="76.00001" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">카드</ONESHAPE>
    <ONESHAPE NAME="라벨17" LEFT="105.0" TOP="45.0" WIDTH="76.00001" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">방문</ONESHAPE>
    <ONESHAPE NAME="라벨20" LEFT="181.0" TOP="45.0" WIDTH="76.00001" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">자동이체</ONESHAPE>
    <ONESHAPE NAME="라벨23" LEFT="409.0" TOP="45.0" WIDTH="76.00001" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">합계</ONESHAPE>
    <ONESHAPE NAME="라벨26" LEFT="484.97638" TOP="45.0" WIDTH="76.00001" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">선불</ONESHAPE>
    <ONESHAPE NAME="라벨2" LEFT="333.0" TOP="45.0" WIDTH="76.00001" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">기타</ONESHAPE>
    <ONESHAPE NAME="라벨7" TOP="28.999998" WIDTH="80.0" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;, &quot;지국명 : &quot; + #OZFormParam.sv_bonm#  + &quot; 지국&quot;);" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨11" LEFT="29.0" TOP="58.0" WIDTH="28.0" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">수량</ONESHAPE>
    <ONESHAPE NAME="라벨12" LEFT="56.999996" TOP="58.0" WIDTH="48.000008" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">금액</ONESHAPE>
    <ONESHAPE NAME="라벨14" LEFT="105.0" TOP="58.0" WIDTH="28.0" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">수량</ONESHAPE>
    <ONESHAPE NAME="라벨15" LEFT="133.0" TOP="58.0" WIDTH="48.000008" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">금액</ONESHAPE>
    <ONESHAPE NAME="라벨16" LEFT="181.0" TOP="58.0" WIDTH="28.0" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">수량</ONESHAPE>
    <ONESHAPE NAME="라벨18" LEFT="209.0" TOP="58.0" WIDTH="48.000008" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">금액</ONESHAPE>
    <ONESHAPE NAME="라벨19" LEFT="257.0" TOP="58.0" WIDTH="28.0" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">수량</ONESHAPE>
    <ONESHAPE NAME="라벨21" LEFT="285.0" TOP="58.0" WIDTH="48.000008" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">금액</ONESHAPE>
    <ONESHAPE NAME="라벨22" LEFT="333.0" TOP="58.0" WIDTH="28.0" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">수량</ONESHAPE>
    <ONESHAPE NAME="라벨24" LEFT="361.0" TOP="58.0" WIDTH="48.000008" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">금액</ONESHAPE>
    <ONESHAPE NAME="라벨25" LEFT="485.0" TOP="58.0" WIDTH="28.0" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">수량</ONESHAPE>
    <ONESHAPE NAME="라벨27" LEFT="437.0" TOP="58.0" WIDTH="48.000008" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">금액</ONESHAPE>
    <ONESHAPE NAME="라벨28" LEFT="409.0" TOP="58.0" WIDTH="28.0" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">수량</ONESHAPE>
    <ONESHAPE NAME="라벨29" LEFT="512.9764" TOP="58.0" WIDTH="48.000008" HEIGHT="13.039371" PAINTALLOW="1" FONTNAME="굴림체">금액</ONESHAPE>
    <ONESHAPE NAME="라벨8" LEFT="203.0" TOP="28.999998" WIDTH="152.0" HEIGHT="14.173228" SCRIPTCODE="string str;~OZ#CRLFstr =&quot;입금일자 : &quot; +~OZ#CRLF      substr(#SP_SL_P_CLAMT_MTHSTTS.OZParam.iv_frrecpdt#, 0, 4) + &quot;-&quot; +~OZ#CRLF      substr(#SP_SL_P_CLAMT_MTHSTTS.OZParam.iv_frrecpdt#, 4, 2) + &quot;-&quot; +~OZ#CRLF      substr(#SP_SL_P_CLAMT_MTHSTTS.OZParam.iv_frrecpdt#, 6, 4) + &quot;~&quot; +~OZ#CRLF      substr(#SP_SL_P_CLAMT_MTHSTTS.OZParam.iv_torecpdt#, 0, 4) + &quot;-&quot; +~OZ#CRLF      substr(#SP_SL_P_CLAMT_MTHSTTS.OZParam.iv_torecpdt#, 4, 2) + &quot;-&quot; +~OZ#CRLF      substr(#SP_SL_P_CLAMT_MTHSTTS.OZParam.iv_torecpdt#, 6, 4) ;~OZ#CRLFsetattr(&quot;caption&quot;, str);" PAINTALLOW="1" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="1"></ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="71.03937" WIDTH="560.9764" HEIGHT="2.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="데이터 풋터밴드2" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" ODINAME="SP_SL_P_CLAMT_MTHSTTS" MASTER="리포트1" DATASOURCENAME="Shadow_Master" SUBDATALIST="데이터 밴드2" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="false" />
  <OZBAND NAME="데이터 풋터밴드2" TOP="73.03937" WIDTH="560.9764" HEIGHT="13.039371" BANDTYPE="7" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="15">
    <ONESHAPE NAME="라벨128" WIDTH="29.0" HEIGHT="13.039371" PAINTALLOW="1" EXP="합계" FONTNAME="굴림체">합계</ONESHAPE>
    <ONESHAPE NAME="라벨129" LEFT="29.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.GRQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.GRQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨130" LEFT="56.999996" WIDTH="48.000008" HEIGHT="13.039368" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.GRAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.GRAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨134" LEFT="257.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.CARDQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.CARDQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨137" LEFT="105.0" WIDTH="28.0" HEIGHT="13.039368" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.BMQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.BMQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨140" LEFT="181.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.AUTOQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.AUTOQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨142" LEFT="333.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.ETC_QTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.ETC_QTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨143" LEFT="485.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.PRE_QTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.PRE_QTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨146" LEFT="409.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.SUMQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.SUMQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨150" LEFT="133.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.BMAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.BMAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨153" LEFT="209.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.AUTOAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.AUTOAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨154" LEFT="285.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.CARDAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.CARDAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨156" LEFT="361.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.ETC_CLAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.ETC_CLAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨157" LEFT="512.9764" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.PRE_AMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.PRE_AMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨160" LEFT="437.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.SUMAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.SUMAMT.sum</ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드2" TOP="86.078735" WIDTH="560.9764" HEIGHT="13.039371" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="데이터 풋터밴드1" HEADERDUMMY="" FOOTERDUMMY="" COUNT="15" ODINAME="SP_SL_P_CLAMT_MTHSTTS" MASTER="데이터 밴드1" DATASOURCENAME="Shadow_Detail" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <ONESHAPE NAME="라벨58" WIDTH="29.0" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="DLVDSTCCD" FORMAT="###,###,###,##0" FONTNAME="굴림체">&lt;Shadow_Detail:DLVDSTCCD&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨59" LEFT="29.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="GRQTY" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:GRQTY&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨60" LEFT="56.999996" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="GRAMT" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:GRAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨66" LEFT="257.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="CARDQTY" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:CARDQTY&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨70" LEFT="105.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="BMQTY" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:BMQTY&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨73" LEFT="181.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="AUTOQTY" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:AUTOQTY&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨75" LEFT="333.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="ETC_QTY" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:ETC_QTY&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨76" LEFT="485.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="PRE_QTY" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:PRE_QTY&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨79" LEFT="409.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="SUMQTY" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:SUMQTY&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨84" LEFT="133.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="BMAMT" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:BMAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨90" LEFT="209.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="AUTOAMT" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:AUTOAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨92" LEFT="285.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="CARDAMT" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:CARDAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨96" LEFT="361.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="ETC_CLAMT" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:ETC_CLAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨98" LEFT="437.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="SUMAMT" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:SUMAMT&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨104" LEFT="512.9764" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" DATASETNAME="Shadow_Detail" COLNAME="PRE_AMT" FORMAT="###,###,###,##0" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">&lt;Shadow_Detail:PRE_AMT&gt;</ONESHAPE>
  </OZDATABAND>
  <OZBAND NAME="데이터 풋터밴드1" TOP="99.1181" WIDTH="560.9764" HEIGHT="13.039371" BANDTYPE="7" PARENT="데이터 밴드2" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="15">
    <ONESHAPE NAME="라벨61" WIDTH="29.0" HEIGHT="13.039371" PAINTALLOW="1" EXP="소계" FONTNAME="굴림체" SPACING="-1.0">소계</ONESHAPE>
    <ONESHAPE NAME="라벨64" LEFT="29.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.GRQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.GRQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨67" LEFT="56.999996" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.GRAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.GRAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨89" LEFT="181.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.AUTOQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.AUTOQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨95" LEFT="105.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.BMQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.BMQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨101" LEFT="257.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.CARDQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.CARDQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨105" LEFT="333.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.ETC_QTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.ETC_QTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨107" LEFT="485.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.PRE_QTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.PRE_QTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨111" LEFT="409.0" WIDTH="28.0" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.SUMQTY.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.SUMQTY.sum</ONESHAPE>
    <ONESHAPE NAME="라벨115" LEFT="133.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.BMAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.BMAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨118" LEFT="285.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.AUTOAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.AUTOAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨119" LEFT="209.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.AUTOAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.AUTOAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨121" LEFT="361.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.ETC_CLAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.ETC_CLAMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨122" LEFT="512.9764" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.PRE_AMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.PRE_AMT.sum</ONESHAPE>
    <ONESHAPE NAME="라벨125" LEFT="437.0" WIDTH="48.000008" HEIGHT="13.039371" DATATYPE="5" PAINTALLOW="1" ODINAME="SP_SL_P_CLAMT_MTHSTTS" FORMAT="###,###,###,##0" EXP="Shadow_Detail.SUMAMT.sum" FONTNAME="굴림체" HALIGN="2" SPACING="-1.0">Shadow_Detail.SUMAMT.sum</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="페이지 풋터밴드2" TOP="112.15747" WIDTH="560.9764" HEIGHT="14.173228" BANDTYPE="9" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="5" LASTPAGESKIP="false">
    <ONESHAPE NAME="라벨163" LEFT="271.03235" WIDTH="8.0" HEIGHT="14.173228" PAINTALLOW="1" NOFRAME="true" FONTNAME="굴림체">/</ONESHAPE>
    <ONESHAPE NAME="라벨164" LEFT="224.99998" WIDTH="46.03238" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" NOFRAME="true" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨165" LEFT="279.03235" WIDTH="45.0" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" NOFRAME="true" FONTNAME="굴림체" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨166" LEFT="456.9765" WIDTH="103.99988" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;, #OZFormParam.sv_bonm# + &quot;지국 &quot; + #OZFormParam.sv_uid#);" PAINTALLOW="1" NOFRAME="true" FONTNAME="굴림체" VALIGN="2" HALIGN="2"></ONESHAPE>
    <ONESHAPE NAME="라벨167" WIDTH="104.0" HEIGHT="14.173228" SCRIPTCODE="string str ;~OZ#CRLFstr =&quot;PGNM : &quot; + #OZFormParam.sv_uid#;~OZ#CRLFsetattr(&quot;caption&quot;, str);" PAINTALLOW="1" NOFRAME="true" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
  </OZBAND>
  <OZBACKBAND NAME="배경1" WIDTH="560.9764" HEIGHT="728.50397" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="굴림" FONTFAMILY="Gulim" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_SL_P_CLAMT_MTHSTTS" GROUP="/" CATEGORY="/" ODINAME="SP_SL_P_CLAMT_MTHSTTS.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_MTHCD" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_List" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_Master" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="Shadow_Detail" MASTERSET="Shadow_Master" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="iv_bocd" VALUE="13430" />
	<PARAMFIELD FIELDNAME="iv_medicd" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_frdst" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_todst" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_teamcd" VALUE="" />
	<PARAMFIELD FIELDNAME="iv_frrecpdt" VALUE="20040522" />
	<PARAMFIELD FIELDNAME="iv_torecpdt" VALUE="20040624" />
	<PARAMFIELD FIELDNAME="iv_sawol" VALUE="" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS>
    <OZFORMPARAM FIELDNAME="sv_url" TYPE="12" VALUE="TEST/001" />
    <OZFORMPARAM FIELDNAME="sv_uid" TYPE="12" VALUE="TEST" />
    <OZFORMPARAM FIELDNAME="sv_bonm" TYPE="12" VALUE="Slayer&apos;s" />
  </OZFORMPARAMS>
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

