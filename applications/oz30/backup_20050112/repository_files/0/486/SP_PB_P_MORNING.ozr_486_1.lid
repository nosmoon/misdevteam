OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="false" TOPMARGIN="30.047243" LEFTMARGIN="20.125984" BOTTOMMARGIN="20.125984" RIGHTMARGIN="20.125984" PAPERSIZE="1" PAPERWIDTH="841.88983" PAPERHEIGHT="594.9921" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="true" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1101735069546" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="8" FONTNAME="굴림체" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="801.6379" HEIGHT="544.8189" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드1#%$oz*&amp;^데이터 밴드2" SRC="" />
  <OZBAND NAME="타이틀 밴드1" WIDTH="801.6379" HEIGHT="56.0" BANDTYPE="2" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨1" WIDTH="801.6379" HEIGHT="56.0" PAINTALLOW="1" FONTSIZE="18" FONTSTYLE="1">모닝플러스 회원</ONESHAPE>
  </OZBAND>
  <OZBAND NAME="데이터 헤더밴드1" TOP="56.0" WIDTH="801.6379" HEIGHT="30.17323" BANDTYPE="5" PARENT="데이터 밴드1" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1">
    <ONESHAPE NAME="라벨29" LEFT="24.0" TOP="8.0" WIDTH="328.0" HEIGHT="14.173228" SCRIPTCODE="string fromDate ;~OZ#CRLFstring toDate;~OZ#CRLFstring medinm;~OZ#CRLFstring totalcnt;~OZ#CRLF~OZ#CRLFfromDate = substr(#SP_PB_P_MORNING.OZParam.aplcdt_from#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_MORNING.OZParam.aplcdt_from#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_MORNING.OZParam.aplcdt_from#, 6, 2) ;~OZ#CRLFtoDate=substr(#SP_PB_P_MORNING.OZParam.aplcdt_to#,0,4)+&quot;/&quot;+ substr(#SP_PB_P_MORNING.OZParam.aplcdt_to#,4,2)+&quot;/&quot;+ substr(#SP_PB_P_MORNING.OZParam.aplcdt_to#, 6, 2) ;~OZ#CRLFmedinm = #SP_PB_P_MORNING.SET_SP_PB_P_MORNING.ov_medinm#;~OZ#CRLFtotalcnt = #SP_PB_P_MORNING.SET_SP_PB_P_MORNING.ov_totalcnt#;~OZ#CRLF~OZ#CRLFsetattr(&quot;caption&quot;, &quot; 매체명 :&quot; +medinm + &quot;      신청기간 : &quot;+fromDate+&quot; - &quot; +toDate + &quot;     CNT : &quot; +totalcnt);~OZ#CRLF" PAINTALLOW="1" FORMAT_OPTION="normal#none" NOFRAME="true" HALIGN="1"></ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="86.17323" WIDTH="801.6379" HEIGHT="65.82677" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="데이터 헤더밴드1" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_MORNING" MASTER="리포트1" DATASOURCENAME="SET_moringcur" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZTable NAME="테이블1" WIDTH="800.0" HEIGHT="28.346455" ODINAME="SP_PB_P_MORNING" DATASET="SET_moringcur" ROWCOUNT="0" ISFIXFORM="false" SHOWCOUNT="true" SELLABEL="REGDT#%$oz*&amp;^RDR_NO#%$oz*&amp;^RDRNM#%$oz*&amp;^MEDINM#%$oz*&amp;^TEL_NO#%$oz*&amp;^PTPH_NO#%$oz*&amp;^ZIP#%$oz*&amp;^ADDR#%$oz*&amp;^PROCDT#%$oz*&amp;^ONLMEMBID#%$oz*&amp;^EMAIL" AUTOSIZE="false" HAVETITLE="true" FIXTITLE="false">
      <OZTTLABEL NAME="라벨2" WIDTH="48.0" HEIGHT="14.173225" PAINTALLOW="1" BGCOLOR="-3355393" INDEX_X="0" INDEX_Y="0">No.</OZTTLABEL>
      <OZTTLABEL NAME="라벨3" LEFT="48.0" WIDTH="46.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="REGDT" BGCOLOR="-3355393" INDEX_X="1" INDEX_Y="0">신청일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨4" LEFT="94.0" WIDTH="48.338593" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="RDR_NO" BGCOLOR="-3355393" INDEX_X="2" INDEX_Y="0">독자번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨5" LEFT="142.3386" WIDTH="48.338593" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="RDRNM" BGCOLOR="-3355393" INDEX_X="3" INDEX_Y="0">독자명</OZTTLABEL>
      <OZTTLABEL NAME="라벨6" LEFT="190.67719" WIDTH="55.338562" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="MEDINM" BGCOLOR="-3355393" INDEX_X="4" INDEX_Y="0">매체명</OZTTLABEL>
      <OZTTLABEL NAME="라벨7" LEFT="246.01575" WIDTH="56.968567" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="TEL_NO" BGCOLOR="-3355393" INDEX_X="5" INDEX_Y="0">전화</OZTTLABEL>
      <OZTTLABEL NAME="라벨8" LEFT="302.9843" WIDTH="56.3385" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="PTPH_NO" BGCOLOR="-3355393" INDEX_X="6" INDEX_Y="0">핸드폰</OZTTLABEL>
      <OZTTLABEL NAME="라벨9" LEFT="359.3228" WIDTH="32.677185" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="ZIP" BGCOLOR="-3355393" INDEX_X="7" INDEX_Y="0">우편번호</OZTTLABEL>
      <OZTTLABEL NAME="라벨10" LEFT="392.0" WIDTH="192.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="ADDR" BGCOLOR="-3355393" INDEX_X="8" INDEX_Y="0">주소</OZTTLABEL>
      <OZTTLABEL NAME="라벨11" LEFT="584.0" WIDTH="47.338623" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="PROCDT" BGCOLOR="-3355393" INDEX_X="9" INDEX_Y="0">처리일자</OZTTLABEL>
      <OZTTLABEL NAME="라벨13" LEFT="631.3386" WIDTH="62.661377" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="ONLMEMBID" BGCOLOR="-3355393" INDEX_X="10" INDEX_Y="0">ChosunID</OZTTLABEL>
      <OZTTLABEL NAME="라벨12" LEFT="694.0" WIDTH="106.0" HEIGHT="14.173225" PAINTALLOW="1" COLNAME="EMAIL" BGCOLOR="-3355393" INDEX_X="11" INDEX_Y="0">E-MAIL</OZTTLABEL>
      <OZGROUPLABEL NAME="라벨14" TOP="14.173225" WIDTH="48.0" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" INDEX_X="0" INDEX_Y="1"></OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨15" LEFT="48.0" TOP="14.173225" WIDTH="46.0" HEIGHT="14.173229" SCRIPTCODE="string regdt ;~OZ#CRLFregdt = substr(#SP_PB_P_MORNING.SET_moringcur.REGDT#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_MORNING.SET_moringcur.REGDT#, 4, 2)+&quot;/&quot;+ substr(#SP_PB_P_MORNING.SET_moringcur.REGDT#, 6, 2) ;~OZ#CRLFsetattr(&quot;caption&quot;,regdt);~OZ#CRLF" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="REGDT" INDEX_X="1" INDEX_Y="1">REGDT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨16" LEFT="94.0" TOP="14.173225" WIDTH="48.338593" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="RDR_NO" INDEX_X="2" INDEX_Y="1">RDR_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨17" LEFT="142.3386" TOP="14.173225" WIDTH="48.338593" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="RDRNM" WORDWRAP="true" INDEX_X="3" INDEX_Y="1">RDRNM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨18" LEFT="190.67719" TOP="14.173225" WIDTH="55.338562" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="MEDINM" WORDWRAP="true" INDEX_X="4" INDEX_Y="1">MEDINM</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨19" LEFT="246.01575" TOP="14.173225" WIDTH="56.968567" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="TEL_NO" HALIGN="1" INDEX_X="5" INDEX_Y="1">TEL_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨20" LEFT="302.9843" TOP="14.173225" WIDTH="56.3385" HEIGHT="14.173229" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="PTPH_NO" HALIGN="1" INDEX_X="6" INDEX_Y="1">PTPH_NO</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨21" LEFT="359.3228" TOP="14.173225" WIDTH="32.677185" HEIGHT="14.173229" SCRIPTCODE="string zip ;~OZ#CRLFzip = substr(#SP_PB_P_MORNING.SET_moringcur.ZIP#, 0, 3)+&quot;-&quot;+ substr(#SP_PB_P_MORNING.SET_moringcur.ZIP#,3,3) ;~OZ#CRLFsetattr(&quot;caption&quot;,zip);~OZ#CRLF" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="ZIP" INDEX_X="7" INDEX_Y="1">ZIP</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨22" LEFT="392.0" TOP="14.173225" WIDTH="192.0" HEIGHT="14.173229" SCRIPTCODE="setattr(&quot;caption &quot;, #SP_PB_P_MORNING.SET_moringcur.ADDR# + &quot; &quot; + #SP_PB_P_MORNING.SET_moringcur.DTLSADDR#);" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="ADDR" HALIGN="1" WORDWRAP="true" INDEX_X="8" INDEX_Y="1">ADDR</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨23" LEFT="584.0" TOP="14.173225" WIDTH="47.338623" HEIGHT="14.173229" SCRIPTCODE="string procdt ;~OZ#CRLFprocdt = substr(#SP_PB_P_MORNING.SET_moringcur.PROCDT#, 0, 4)+&quot;/&quot;+ substr(#SP_PB_P_MORNING.SET_moringcur.PROCDT#,4, 2)+&quot;/&quot;+ substr(#SP_PB_P_MORNING.SET_moringcur.PROCDT#, 6, 2) ;~OZ#CRLFsetattr(&quot;caption&quot;,procdt);~OZ#CRLF" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="PROCDT" INDEX_X="9" INDEX_Y="1">PROCDT</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨24" LEFT="631.3386" TOP="14.173225" WIDTH="62.661377" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="ONLMEMBID" HALIGN="1" WORDWRAP="true" INDEX_X="10" INDEX_Y="1">ONLMEMBID</OZGROUPLABEL>
      <OZGROUPLABEL NAME="라벨25" LEFT="694.0" TOP="14.173225" WIDTH="106.0" HEIGHT="14.173229" AUTOSIZE="true" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_PB_P_MORNING" DATASETNAME="SET_moringcur" COLNAME="EMAIL" HALIGN="1" WORDWRAP="true" INDEX_X="11" INDEX_Y="1">EMAIL</OZGROUPLABEL>
    </OZTable>
  </OZDATABAND>
  <OZDATABAND NAME="데이터 밴드2" TOP="152.0" WIDTH="801.6379" HEIGHT="102.82678" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_PB_P_MORNING" MASTER="리포트1" DATASOURCENAME="SET_SP_PB_P_MORNING" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZGROUP2 NAME="크로스탭1" LEFT="505.11813" TOP="24.826782" WIDTH="176.0" HEIGHT="48.0" DUMMYCHK="TRUE" ODINAME="SP_PB_P_MORNING" DATASET="SET_medicdcur" FIXEDTITLE="FALSE" TitleType="1" SumPrior="1" AUTOSIZE="FALSE" FIXEDPOSITION="FALSE" ROWCNT="1" COLCNT="1" VALUECNT="1" ROWCELLCNT="2" COLCELLCNT="1" TOPBASIS="0.0" LEFTBASIS="72.0" ISLIST="TRUE" MERGECELL="FALSE">
      <OZCTPivots LAYOUT="1">
	<OZCTGroupPivot NAME="OZCTGroupPivot_ROW_0" DEPTH="0" FIELDNAME="MEDINM" AGGREGATION="SUM" GroupID="0" SummaryID="1" isVisible="true" forceNewPage="false" omitSum="true" SORTTYPE="0">MEDINM
	  <OZCTSummaryPivot NAME="OZCTSummaryPivot_ROW_0_0" DEPTH="0" FIELDNAME="" AGGREGATION="SUM">합계</OZCTSummaryPivot>
	  <OZCTTITLESHAPE NAME="CTTitleSh1" WIDTH="72.0" HEIGHT="24.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="10" PIVOT="OZCTGroupPivot_ROW_0">MEDINM</OZCTTITLESHAPE>
	  <OZCTTITLESHAPE NAME="CTTitleSh2" TOP="24.0" WIDTH="72.0" HEIGHT="24.0" PAINTALLOW="1" BGCOLOR="-3355393" FONTSIZE="10" PIVOT="OZCTSummaryPivot_ROW_0_0">합계</OZCTTITLESHAPE>
	</OZCTGroupPivot>
      </OZCTPivots>
      <OZCTPivots LAYOUT="2">
	<OZCTGroupPivot NAME="OZCTGroupPivot_COL_-1" DEPTH="-1" FIELDNAME="#%$oz*&amp;^" AGGREGATION="NON" GroupID="0" SummaryID="-1" isVisible="false" forceNewPage="false" omitSum="false" SORTTYPE="0">#%$oz*&amp;^</OZCTGroupPivot>
      </OZCTPivots>
      <OZCTValuePivots LAYOUT="2" SHOWTITLE="false">
	<OZCTValuePivot NAME="OZCTValuePivot_COL_0" DEPTH="0" FIELDNAME="MEDICNT" AGGREGATION="SUM">합계</OZCTValuePivot>
      </OZCTValuePivots>
      <OZCTVALUESHAPE NAME="CTValueSh1" LEFT="72.0" WIDTH="104.0" HEIGHT="24.0" PAINTALLOW="1" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" FONTSIZE="10" HALIGN="2" RIGHTMARGIN="10.0" ROW="OZCTGroupPivot_ROW_0" COLUMN="" VALUE="OZCTValuePivot_COL_0"></OZCTVALUESHAPE>
      <OZCTVALUESHAPE NAME="CTValueSh2" LEFT="72.0" TOP="24.0" WIDTH="104.0" HEIGHT="24.0" PAINTALLOW="1" FORMAT="#,###;-#,###" FORMAT_OPTION="number#NA" FONTSIZE="10" HALIGN="2" RIGHTMARGIN="10.0" ROW="OZCTSummaryPivot_ROW_0_0" COLUMN="" VALUE="OZCTValuePivot_COL_0"></OZCTVALUESHAPE>
    </OZGROUP2>
  </OZDATABAND>
  <OZBACKBAND NAME="배경1" WIDTH="801.6379" HEIGHT="544.8189" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_PB_P_MORNING" GROUP="/" CATEGORY="/" ODINAME="SP_PB_P_MORNING.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_SP_PB_P_MORNING" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_moringcur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_medicdcur" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0">
	<PARAMFIELD FIELDNAME="bocd" VALUE="b0105" />
	<PARAMFIELD FIELDNAME="medicd" VALUE="" />
	<PARAMFIELD FIELDNAME="aplcdt_from" VALUE="20041001" />
	<PARAMFIELD FIELDNAME="aplcdt_to" VALUE="20041115" />
      </OZFORMSET>
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS />
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

