OZR    OZ Report File<?xml version="1.0" encoding="UTF-8"?>

<OZREPORT USERVERSION="0" TITLE="" ORIENTATION="true" TOPMARGIN="56.692913" LEFTMARGIN="56.692913" BOTTOMMARGIN="56.692913" RIGHTMARGIN="56.692913" PAPERSIZE="1" PAPERWIDTH="594.9921" PAPERHEIGHT="841.88983" SCRIPTBCE="false" VIRTUALX="1.0" VIRTUALY="1.0" MAPMODE="4" IGNORENULLDATA="false" PARAMETERFLAG="#" REPORT_SCRIPT_OPTION="null">
  <VERSION VERSION="3.0" DATE="1083551962328" />
  <BASICLABEL VALIGN="0" HALIGN="0" AUTOSIZE="false" CRLFTOLF="false" ANDSYMBOL="false" WORDWRAP="false" WRAPSPACE="0.0" TRANSPARENT="false" CLIP="false" EFFECT="Basic" NOFRAME="false" STRETCHTYPE="1" HSTRETCH="true" VSTRETCH="true" SPACING="0.0" FGCOLOR="-16777216" BGCOLOR="-1" FRAMECOLOR="-16777216" DRAWTOP="0.125" DRAWBOTTOM="0.125" DRAWLEFT="0.125" DRAWRIGHT="0.125" TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" FONTSIZE="8" FONTNAME="굴림" FONTSTYLE="0" />
  <DEFAULTLABEL TOPMARGIN="0.0" BOTTOMMARGIN="0.0" LEFTMARGIN="2.0" RIGHTMARGIN="2.0" TABCOUNT="4" />
  <REPORTINFO NAME="리포트1" WIDTH="481.6063" HEIGHT="728.50397" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드1" SRC="" />
  <OZBAND NAME="페이지 헤더밴드1" WIDTH="481.6063" HEIGHT="72.0" BANDTYPE="1" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="8" FIRSTPAGESKIP="false">
    <ONESHAPE NAME="라벨1" WIDTH="480.0" HEIGHT="28.0" PAINTALLOW="1" FORMAT_OPTION="normal#none" FONTSIZE="15" FONTNAME="굴림체" FONTSTYLE="1" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">계정코드</ONESHAPE>
    <ONESHAPE NAME="라벨2" TOP="51.0" WIDTH="88.0" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="10" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">계정코드</ONESHAPE>
    <ONESHAPE NAME="라벨3" LEFT="88.0" TOP="51.0" WIDTH="135.0" HEIGHT="14.173228" PAINTALLOW="1" FONTSIZE="10" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0">계정명칭</ONESHAPE>
    <ONESHAPE NAME="라벨4" TOP="46.0" WIDTH="481.6063" HEIGHT="2.0" PAINTALLOW="1"></ONESHAPE>
    <OZLINE NAME="선1" TOP="70.0" WIDTH="481.6063" HEIGHT="2.0" />
    <ONESHAPE NAME="라벨10" TOP="29.0" WIDTH="80.0" HEIGHT="16.0" SCRIPTCODE="setattr(&quot;caption&quot;, &quot;지국명 : &quot; + #OZFormParam.sv_bonm# + &quot;지국&quot; );" PAINTALLOW="1" NOFRAME="true" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨11" LEFT="395.6063" TOP="29.0" WIDTH="86.0" HEIGHT="16.0" DATATYPE="3" PAINTALLOW="1" COLNAME="Date" FORMAT="date_yyyy-MM-dd hh:mm" FORMAT_OPTION="custom#B" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">&lt;OZSystem:Date&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨12" LEFT="349.0" TOP="29.0" WIDTH="48.0" HEIGHT="16.0" PAINTALLOW="1" FONTNAME="굴림체" DRAWTOP="0.0" DRAWBOTTOM="0.0" DRAWLEFT="0.0" DRAWRIGHT="0.0" HALIGN="2">출력일자 : </ONESHAPE>
  </OZBAND>
  <OZDATABAND NAME="데이터 밴드1" TOP="72.0" WIDTH="481.6063" HEIGHT="23.0" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="1" ODINAME="SP_SL_P_TASLM_ACCTCD" MASTER="리포트1" DATASOURCENAME="SET_acctcd" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
    <OZREGION NAME="리전1" WIDTH="239.0" HEIGHT="22.0" X_EXTENDED="1" Y_EXTENDED="1" SUBDATALIST="데이터 밴드2" SRC="" BINDTYPE="6" HGAP="0.0" VGAP="0.0">
      <OZDATABAND NAME="데이터 밴드2" WIDTH="239.0" HEIGHT="22.677166" BANDTYPE="4" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="2" ODINAME="SP_SL_P_TASLM_ACCTCD" MASTER="리전1" DATASOURCENAME="SET_List" SUBDATALIST="" FIXEDTITLE="false" FIXEDMASTER="false" SHOWLINK="true" VISIBLE="true">
	<ONESHAPE NAME="ACCTCD" WIDTH="88.0" HEIGHT="22.677166" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_TASLM_ACCTCD" DATASETNAME="SET_List" COLNAME="ACCTCD" FONTSIZE="10" FONTNAME="굴림체">&lt;SET_List:ACCTCD&gt;</ONESHAPE>
	<ONESHAPE NAME="ACCTNM" LEFT="88.0" WIDTH="135.0" HEIGHT="22.677166" DATATYPE="2" PAINTALLOW="1" ODINAME="SP_SL_P_TASLM_ACCTCD" DATASETNAME="SET_List" COLNAME="ACCTNM" FONTSIZE="10" FONTNAME="굴림체" HALIGN="1">&lt;SET_List:ACCTNM&gt;</ONESHAPE>
      </OZDATABAND>
    </OZREGION>
  </OZDATABAND>
  <OZBAND NAME="페이지 풋터밴드1" TOP="95.0" WIDTH="481.6063" HEIGHT="15.173228" BANDTYPE="9" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="6" LASTPAGESKIP="false">
    <ONESHAPE NAME="라벨5" LEFT="243.03238" TOP="1.0" WIDTH="8.0" HEIGHT="14.173228" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체">/</ONESHAPE>
    <ONESHAPE NAME="라벨6" LEFT="197.0" TOP="1.0" WIDTH="46.03238" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Page_Number" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="2">&lt;OZSystem:Page_Number&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨7" LEFT="251.03238" TOP="1.0" WIDTH="45.0" HEIGHT="14.173228" DATATYPE="3" PAINTALLOW="1" COLNAME="Total_Page" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1">&lt;OZSystem:Total_Page&gt;</ONESHAPE>
    <ONESHAPE NAME="라벨8" TOP="1.0" WIDTH="104.0" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;, &quot;PGNM : &quot; + #OZFormParam.sv_url#);" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" HALIGN="1"></ONESHAPE>
    <ONESHAPE NAME="라벨9" LEFT="377.6064" TOP="1.0" WIDTH="103.99988" HEIGHT="14.173228" SCRIPTCODE="setattr(&quot;caption&quot;, #OZFormParam.sv_bonm# + &quot;지국 &quot; + #OZFormParam.sv_uid#);" PAINTALLOW="1" NOFRAME="true" FONTSIZE="9" FONTNAME="굴림체" VALIGN="2" HALIGN="2"></ONESHAPE>
    <OZLINE NAME="선2" WIDTH="481.6063" HEIGHT="2.0" />
  </OZBAND>
  <OZBACKBAND NAME="배경1" WIDTH="481.6063" HEIGHT="728.50397" BANDTYPE="101" PARENT="" FORCENEWPAGE="false" AUTOSIZE="false" HEADERBANDNAME="" FOOTERBANDNAME="" HEADERDUMMY="" FOOTERDUMMY="" COUNT="0" />
  <OZFONTDESC>
    <OZFONTFAMILY NAME="굴림체" FONTFAMILY="GulimChe" />
    <OZFONTFAMILY NAME="굴림" FONTFAMILY="Gulim" />
  </OZFONTDESC>
  <OZODILIST>
    <OZODIITEM NAME="SP_SL_P_TASLM_ACCTCD" GROUP="/" CATEGORY="/" ODINAME="SP_SL_P_TASLM_ACCTCD.odi" FROMSERVER="false">
      <OZFORMSET NAME="SET_acctcd" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="SET_List" MASTERSET="" USED="true" MAXROW="0" />
      <OZFORMSET NAME="OZParam" MASTERSET="" USED="true" MAXROW="0" />
    </OZODIITEM>
  </OZODILIST>
  <OZFORMPARAMS>
    <OZFORMPARAM FIELDNAME="sv_url" TYPE="12" VALUE="TEST/001" />
    <OZFORMPARAM FIELDNAME="sv_uid" TYPE="12" VALUE="TEST" />
    <OZFORMPARAM FIELDNAME="sv_bonm" TYPE="12" VALUE="Slayer&apos;s" />
  </OZFORMPARAMS>
  <OZGRIDINFO GRIDOPERATE="true" GRIDSHOW="false" GRIDX="8.0" GRIDY="8.0" GRIDTYPE="1" />
</OZREPORT>

