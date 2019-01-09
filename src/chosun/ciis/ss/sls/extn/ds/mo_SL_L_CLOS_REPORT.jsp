<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/comm_jsp/sl_common_mobile.jsp" %>
/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


<%
	SL_L_CLOS_REPORTDataSet ds = (SL_L_CLOS_REPORTDataSet)request.getAttribute("ds");
%>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>


<%
	if( ds.curextncloslist.size() > 0 ){
		SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord rec = null;
		for( int i=0; i < ds.curextncloslist.size(); i++ ){
			rec = (SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord)ds.curextncloslist.get( i );
%>

	<deptcd><%= rec.deptcd %></deptcd>
	<deptnm><%= rec.deptnm %></deptnm>
	<partcd><%= rec.partcd %></partcd>
	<partnm><%= rec.partnm %></partnm>
	<areacd><%= rec.areacd %></areacd>
	<areanm><%= rec.areanm %></areanm>
	<bocd><%= rec.bocd %></bocd>
	<bonm><%= rec.bonm %></bonm>
	<oprenvclsf><%= rec.oprenvclsf %></oprenvclsf>
	<rdrnm><%= rec.rdrnm %></rdrnm>
	<rdr_no><%= rec.rdr_no %></rdr_no>
	<qty><%= rec.qty %></qty>
	<addrcdnm><%= rec.addrcdnm %></addrcdnm>
	<addrs><%= rec.addrs %></addrs>
	<rdrtel_no1><%= rec.rdrtel_no1 %></rdrtel_no1>
	<rdrtel_no2><%= rec.rdrtel_no2 %></rdrtel_no2>
	<rdrtel_no3><%= rec.rdrtel_no3 %></rdrtel_no3>
	<rdrptph_no1><%= rec.rdrptph_no1 %></rdrptph_no1>
	<rdrptph_no2><%= rec.rdrptph_no2 %></rdrptph_no2>
	<rdrptph_no3><%= rec.rdrptph_no3 %></rdrptph_no3>
	<rdr_extndt><%= rec.rdr_extndt %></rdr_extndt>
	<incmgdt><%= rec.incmgdt %></incmgdt>
	<valmm><%= rec.valmm %></valmm>
	<dscnamt><%= rec.dscnamt %></dscnamt>
	<clamtmthd><%= rec.clamtmthd %></clamtmthd>
	<rdr_extntype1><%= rec.rdr_extntype1 %></rdr_extntype1>
	<rdr_extntype2><%= rec.rdr_extntype2 %></rdr_extntype2>
	<camptype><%= rec.camptype %></camptype>
	<extnnm><%= rec.extnnm %></extnnm>
	<stafno><%= rec.stafno %></stafno>
	<aplcpath><%= rec.aplcpath %></aplcpath>
	<resitype><%= rec.resitype %></resitype>
	<mvindt><%= rec.mvindt %></mvindt>
	<mvintodt><%= rec.mvintodt %></mvintodt>
	<reconfyn><%= rec.reconfyn %></reconfyn>
	<mormembid><%= rec.mormembid %></mormembid>
	<rdr_extnprvlastsuspdt><%= rec.rdr_extnprvlastsuspdt %></rdr_extnprvlastsuspdt>
	<remk><%= rec.remk %></remk>
	<suspdt><%= rec.suspdt %></suspdt>
	<suspresn><%= rec.suspresn %></suspresn>
	<bns_itemclsf><%= rec.bns_itemclsf %></bns_itemclsf>
	<bns_itemnm><%= rec.bns_itemnm %></bns_itemnm>
	<svcmm><%= rec.svcmm %></svcmm>
	<scqty><%= rec.scqty %></scqty>
	<scsubsuprc><%= rec.scsubsuprc %></scsubsuprc>
	<hkqty><%= rec.hkqty %></hkqty>
	<hksubsuprc><%= rec.hksubsuprc %></hksubsuprc>
	<boyqty><%= rec.boyqty %></boyqty>
	<boysubsuprc><%= rec.boysubsuprc %></boysubsuprc>
	<hanqty><%= rec.hanqty %></hanqty>
	<hansubsuprc><%= rec.hansubsuprc %></hansubsuprc>
	<trsfdeptnm><%= rec.trsfdeptnm %></trsfdeptnm>
	<trsfbocd><%= rec.trsfbocd %></trsfbocd>
	<trsfbonm><%= rec.trsfbonm %></trsfbonm>
	<dlvmthd><%= rec.dlvmthd %></dlvmthd>
	<post_dlvfee><%= rec.post_dlvfee %></post_dlvfee>
	<subsuprc><%= rec.subsuprc %></subsuprc>
	<shftyn><%= rec.shftyn %></shftyn>
	<ccempyn><%= rec.ccempyn %></ccempyn>
	<trgtyn_j><%= rec.trgtyn_j %></trgtyn_j>
	<thrwyn_j><%= rec.thrwyn_j %></thrwyn_j>
<%
			}
		}else{
%>

	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<oprenvclsf></oprenvclsf>
	<rdrnm></rdrnm>
	<rdr_no></rdr_no>
	<qty></qty>
	<addrcdnm></addrcdnm>
	<addrs></addrs>
	<rdrtel_no1></rdrtel_no1>
	<rdrtel_no2></rdrtel_no2>
	<rdrtel_no3></rdrtel_no3>
	<rdrptph_no1></rdrptph_no1>
	<rdrptph_no2></rdrptph_no2>
	<rdrptph_no3></rdrptph_no3>
	<rdr_extndt></rdr_extndt>
	<incmgdt></incmgdt>
	<valmm></valmm>
	<dscnamt></dscnamt>
	<clamtmthd></clamtmthd>
	<rdr_extntype1></rdr_extntype1>
	<rdr_extntype2></rdr_extntype2>
	<camptype></camptype>
	<extnnm></extnnm>
	<stafno></stafno>
	<aplcpath></aplcpath>
	<resitype></resitype>
	<mvindt></mvindt>
	<mvintodt></mvintodt>
	<reconfyn></reconfyn>
	<mormembid></mormembid>
	<rdr_extnprvlastsuspdt></rdr_extnprvlastsuspdt>
	<remk></remk>
	<suspdt></suspdt>
	<suspresn></suspresn>
	<bns_itemclsf></bns_itemclsf>
	<bns_itemnm></bns_itemnm>
	<svcmm></svcmm>
	<scqty></scqty>
	<scsubsuprc></scsubsuprc>
	<hkqty></hkqty>
	<hksubsuprc></hksubsuprc>
	<boyqty></boyqty>
	<boysubsuprc></boysubsuprc>
	<hanqty></hanqty>
	<hansubsuprc></hansubsuprc>
	<trsfdeptnm></trsfdeptnm>
	<trsfbocd></trsfbocd>
	<trsfbonm></trsfbonm>
	<dlvmthd></dlvmthd>
	<post_dlvfee></post_dlvfee>
	<subsuprc></subsuprc>
	<shftyn></shftyn>
	<ccempyn></ccempyn>
	<trgtyn_j></trgtyn_j>
	<thrwyn_j></thrwyn_j>
<%
	}
%>
<%
	if( ds.cursuspcloslist.size() > 0 ){
		SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord rec = null;
		for( int i=0; i < ds.cursuspcloslist.size(); i++ ){
			rec = (SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord)ds.cursuspcloslist.get( i );
%>

	<deptcd><%= rec.deptcd %></deptcd>
	<deptnm><%= rec.deptnm %></deptnm>
	<partcd><%= rec.partcd %></partcd>
	<partnm><%= rec.partnm %></partnm>
	<areacd><%= rec.areacd %></areacd>
	<areanm><%= rec.areanm %></areanm>
	<bocd><%= rec.bocd %></bocd>
	<bonm><%= rec.bonm %></bonm>
	<rdr_no><%= rec.rdr_no %></rdr_no>
	<addr><%= rec.addr %></addr>
	<rdrnm><%= rec.rdrnm %></rdrnm>
	<dstc><%= rec.dstc %></dstc>
	<medi><%= rec.medi %></medi>
	<subsbgndd><%= rec.subsbgndd %></subsbgndd>
	<valmm><%= rec.valmm %></valmm>
	<freeclsf><%= rec.freeclsf %></freeclsf>
	<resitype><%= rec.resitype %></resitype>
	<rdrtel_no1><%= rec.rdrtel_no1 %></rdrtel_no1>
	<rdrtel_no2><%= rec.rdrtel_no2 %></rdrtel_no2>
	<rdrtel_no3><%= rec.rdrtel_no3 %></rdrtel_no3>
	<rdrptph_no1><%= rec.rdrptph_no1 %></rdrptph_no1>
	<rdrptph_no2><%= rec.rdrptph_no2 %></rdrptph_no2>
	<rdrptph_no3><%= rec.rdrptph_no3 %></rdrptph_no3>
	<rdr_extndt><%= rec.rdr_extndt %></rdr_extndt>
	<rdr_extntype1><%= rec.rdr_extntype1 %></rdr_extntype1>
	<rdr_extntype2><%= rec.rdr_extntype2 %></rdr_extntype2>
	<camprdr_extnnm><%= rec.camprdr_extnnm %></camprdr_extnnm>
	<aplcpath><%= rec.aplcpath %></aplcpath>
	<camptype><%= rec.camptype %></camptype>
	<extnnm><%= rec.extnnm %></extnnm>
	<uprc><%= rec.uprc %></uprc>
	<qty><%= rec.qty %></qty>
	<clamtmatt><%= rec.clamtmatt %></clamtmatt>
	<clamtmonth><%= rec.clamtmonth %></clamtmonth>
	<rcntclamt><%= rec.rcntclamt %></rcntclamt>
	<totsubsmonth><%= rec.totsubsmonth %></totsubsmonth>
	<subsmonth200407aft><%= rec.subsmonth200407aft %></subsmonth200407aft>
	<clamtmthd><%= rec.clamtmthd %></clamtmthd>
	<suspresncd><%= rec.suspresncd %></suspresncd>
	<suspdt><%= rec.suspdt %></suspdt>
	<vexcboyn><%= rec.vexcboyn %></vexcboyn>
	<incmgtm><%= rec.incmgtm %></incmgtm>
	<ccempyn><%= rec.ccempyn %></ccempyn>
	<trgtyn_j><%= rec.trgtyn_j %></trgtyn_j>
<%
			}
		}else{
%>

	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<rdr_no></rdr_no>
	<addr></addr>
	<rdrnm></rdrnm>
	<dstc></dstc>
	<medi></medi>
	<subsbgndd></subsbgndd>
	<valmm></valmm>
	<freeclsf></freeclsf>
	<resitype></resitype>
	<rdrtel_no1></rdrtel_no1>
	<rdrtel_no2></rdrtel_no2>
	<rdrtel_no3></rdrtel_no3>
	<rdrptph_no1></rdrptph_no1>
	<rdrptph_no2></rdrptph_no2>
	<rdrptph_no3></rdrptph_no3>
	<rdr_extndt></rdr_extndt>
	<rdr_extntype1></rdr_extntype1>
	<rdr_extntype2></rdr_extntype2>
	<camprdr_extnnm></camprdr_extnnm>
	<aplcpath></aplcpath>
	<camptype></camptype>
	<extnnm></extnnm>
	<uprc></uprc>
	<qty></qty>
	<clamtmatt></clamtmatt>
	<clamtmonth></clamtmonth>
	<rcntclamt></rcntclamt>
	<totsubsmonth></totsubsmonth>
	<subsmonth200407aft></subsmonth200407aft>
	<clamtmthd></clamtmthd>
	<suspresncd></suspresncd>
	<suspdt></suspdt>
	<vexcboyn></vexcboyn>
	<incmgtm></incmgtm>
	<ccempyn></ccempyn>
	<trgtyn_j></trgtyn_j>
<%
	}
%>
<%
	if( ds.curbocloscloslist.size() > 0 ){
		SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord rec = null;
		for( int i=0; i < ds.curbocloscloslist.size(); i++ ){
			rec = (SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord)ds.curbocloscloslist.get( i );
%>

	<deptcd><%= rec.deptcd %></deptcd>
	<deptnm><%= rec.deptnm %></deptnm>
	<partcd><%= rec.partcd %></partcd>
	<partnm><%= rec.partnm %></partnm>
	<areacd><%= rec.areacd %></areacd>
	<areanm><%= rec.areanm %></areanm>
	<bocd><%= rec.bocd %></bocd>
	<bonm><%= rec.bonm %></bonm>
	<oprenvclsfcd><%= rec.oprenvclsfcd %></oprenvclsfcd>
	<sellnetclsf><%= rec.sellnetclsf %></sellnetclsf>
	<dstccd><%= rec.dstccd %></dstccd>
	<rdr_extnaplc><%= rec.rdr_extnaplc %></rdr_extnaplc>
	<rdr_extnemp><%= rec.rdr_extnemp %></rdr_extnemp>
	<rdr_extnstaf><%= rec.rdr_extnstaf %></rdr_extnstaf>
	<rdr_extnrdr_movm><%= rec.rdr_extnrdr_movm %></rdr_extnrdr_movm>
	<rdr_extnhdqt><%= rec.rdr_extnhdqt %></rdr_extnhdqt>
	<rdr_extnexg><%= rec.rdr_extnexg %></rdr_extnexg>
	<rdr_extncnvs><%= rec.rdr_extncnvs %></rdr_extncnvs>
	<rdr_extnetc><%= rec.rdr_extnetc %></rdr_extnetc>
	<rdr_extnrate><%= rec.rdr_extnrate %></rdr_extnrate>
	<suspmovm><%= rec.suspmovm %></suspmovm>
	<susprefu><%= rec.susprefu %></susprefu>
	<suspothnwsp><%= rec.suspothnwsp %></suspothnwsp>
	<suspetc><%= rec.suspetc %></suspetc>
	<suspetc1><%= rec.suspetc1 %></suspetc1>
	<suspetc2><%= rec.suspetc2 %></suspetc2>
	<suspetc3><%= rec.suspetc3 %></suspetc3>
	<suspetc4><%= rec.suspetc4 %></suspetc4>
	<susprate><%= rec.susprate %></susprate>
	<suspaplc><%= rec.suspaplc %></suspaplc>
	<suspemp><%= rec.suspemp %></suspemp>
	<suspstaf><%= rec.suspstaf %></suspstaf>
	<susprdr_movm><%= rec.susprdr_movm %></susprdr_movm>
	<susphdqt><%= rec.susphdqt %></susphdqt>
	<suspexg><%= rec.suspexg %></suspexg>
	<suspcnvsrdr_extn><%= rec.suspcnvsrdr_extn %></suspcnvsrdr_extn>
	<suspetcrdr_extn><%= rec.suspetcrdr_extn %></suspetcrdr_extn>
	<thmmsendqty><%= rec.thmmsendqty %></thmmsendqty>
	<thmmvalqty><%= rec.thmmvalqty %></thmmvalqty>
	<aftcnt1><%= rec.aftcnt1 %></aftcnt1>
	<aftcnt2><%= rec.aftcnt2 %></aftcnt2>
	<aftcnt3><%= rec.aftcnt3 %></aftcnt3>
	<aftcnt4><%= rec.aftcnt4 %></aftcnt4>
	<aftcnt5><%= rec.aftcnt5 %></aftcnt5>
	<aftcnt6><%= rec.aftcnt6 %></aftcnt6>
	<excsaftcnt6><%= rec.excsaftcnt6 %></excsaftcnt6>
	<aptqty><%= rec.aptqty %></aptqty>
	<villaqty><%= rec.villaqty %></villaqty>
	<housqty><%= rec.housqty %></housqty>
	<offi_roomqty><%= rec.offi_roomqty %></offi_roomqty>
	<shopqty><%= rec.shopqty %></shopqty>
	<etcqty><%= rec.etcqty %></etcqty>
	<pub_infonwsp><%= rec.pub_infonwsp %></pub_infonwsp>
	<hdqt_dntnwsp><%= rec.hdqt_dntnwsp %></hdqt_dntnwsp>
	<bodntnwsp><%= rec.bodntnwsp %></bodntnwsp>
	<frc_thrwnwsp><%= rec.frc_thrwnwsp %></frc_thrwnwsp>
	<etcfreenwsp><%= rec.etcfreenwsp %></etcfreenwsp>
	<resvnwsp><%= rec.resvnwsp %></resvnwsp>
	<cupn><%= rec.cupn %></cupn>
	<thmmno_valqty><%= rec.thmmno_valqty %></thmmno_valqty>
	<thmmqty><%= rec.thmmqty %></thmmqty>
	<nowun_recpqty><%= rec.nowun_recpqty %></nowun_recpqty>
	<medaqty><%= rec.medaqty %></medaqty>
	<re_freeqty><%= rec.re_freeqty %></re_freeqty>
	<lossqty><%= rec.lossqty %></lossqty>
	<ppymqty><%= rec.ppymqty %></ppymqty>
	<temp_stopqty><%= rec.temp_stopqty %></temp_stopqty>
	<now_un_recp_amt><%= rec.now_un_recp_amt %></now_un_recp_amt>
	<thmm_amt><%= rec.thmm_amt %></thmm_amt>
	<thmmdscnamt><%= rec.thmmdscnamt %></thmmdscnamt>
	<thmmpost_dlvfee><%= rec.thmmpost_dlvfee %></thmmpost_dlvfee>
	<meda_amt><%= rec.meda_amt %></meda_amt>
	<re_freeamt><%= rec.re_freeamt %></re_freeamt>
	<lossamt><%= rec.lossamt %></lossamt>
	<ppymamt><%= rec.ppymamt %></ppymamt>
	<temp_stopamt><%= rec.temp_stopamt %></temp_stopamt>
	<giroclamt><%= rec.giroclamt %></giroclamt>
	<vistclamt><%= rec.vistclamt %></vistclamt>
	<giroauto_shiftclamt><%= rec.giroauto_shiftclamt %></giroauto_shiftclamt>
	<docard_shiftclamt><%= rec.docard_shiftclamt %></docard_shiftclamt>
	<gnrcard_shiftclamt><%= rec.gnrcard_shiftclamt %></gnrcard_shiftclamt>
	<onlsetlclamt><%= rec.onlsetlclamt %></onlsetlclamt>
	<etcclamt><%= rec.etcclamt %></etcclamt>
	<un_recp_repm><%= rec.un_recp_repm %></un_recp_repm>
	<new_repm><%= rec.new_repm %></new_repm>
	<pre_repm><%= rec.pre_repm %></pre_repm>
	<arealeafclamt><%= rec.arealeafclamt %></arealeafclamt>
	<teampreisleafclamt><%= rec.teampreisleafclamt %></teampreisleafclamt>
	<thmmval_adsc_qty><%= rec.thmmval_adsc_qty %></thmmval_adsc_qty>
	<thmmval_ndsc_qty><%= rec.thmmval_ndsc_qty %></thmmval_ndsc_qty>
	<unclamtcnt><%= rec.unclamtcnt %></unclamtcnt>
	<closmm><%= rec.closmm %></closmm>
<%
			}
		}else{
%>

	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<oprenvclsfcd></oprenvclsfcd>
	<sellnetclsf></sellnetclsf>
	<dstccd></dstccd>
	<rdr_extnaplc></rdr_extnaplc>
	<rdr_extnemp></rdr_extnemp>
	<rdr_extnstaf></rdr_extnstaf>
	<rdr_extnrdr_movm></rdr_extnrdr_movm>
	<rdr_extnhdqt></rdr_extnhdqt>
	<rdr_extnexg></rdr_extnexg>
	<rdr_extncnvs></rdr_extncnvs>
	<rdr_extnetc></rdr_extnetc>
	<rdr_extnrate></rdr_extnrate>
	<suspmovm></suspmovm>
	<susprefu></susprefu>
	<suspothnwsp></suspothnwsp>
	<suspetc></suspetc>
	<suspetc1></suspetc1>
	<suspetc2></suspetc2>
	<suspetc3></suspetc3>
	<suspetc4></suspetc4>
	<susprate></susprate>
	<suspaplc></suspaplc>
	<suspemp></suspemp>
	<suspstaf></suspstaf>
	<susprdr_movm></susprdr_movm>
	<susphdqt></susphdqt>
	<suspexg></suspexg>
	<suspcnvsrdr_extn></suspcnvsrdr_extn>
	<suspetcrdr_extn></suspetcrdr_extn>
	<thmmsendqty></thmmsendqty>
	<thmmvalqty></thmmvalqty>
	<aftcnt1></aftcnt1>
	<aftcnt2></aftcnt2>
	<aftcnt3></aftcnt3>
	<aftcnt4></aftcnt4>
	<aftcnt5></aftcnt5>
	<aftcnt6></aftcnt6>
	<excsaftcnt6></excsaftcnt6>
	<aptqty></aptqty>
	<villaqty></villaqty>
	<housqty></housqty>
	<offi_roomqty></offi_roomqty>
	<shopqty></shopqty>
	<etcqty></etcqty>
	<pub_infonwsp></pub_infonwsp>
	<hdqt_dntnwsp></hdqt_dntnwsp>
	<bodntnwsp></bodntnwsp>
	<frc_thrwnwsp></frc_thrwnwsp>
	<etcfreenwsp></etcfreenwsp>
	<resvnwsp></resvnwsp>
	<cupn></cupn>
	<thmmno_valqty></thmmno_valqty>
	<thmmqty></thmmqty>
	<nowun_recpqty></nowun_recpqty>
	<medaqty></medaqty>
	<re_freeqty></re_freeqty>
	<lossqty></lossqty>
	<ppymqty></ppymqty>
	<temp_stopqty></temp_stopqty>
	<now_un_recp_amt></now_un_recp_amt>
	<thmm_amt></thmm_amt>
	<thmmdscnamt></thmmdscnamt>
	<thmmpost_dlvfee></thmmpost_dlvfee>
	<meda_amt></meda_amt>
	<re_freeamt></re_freeamt>
	<lossamt></lossamt>
	<ppymamt></ppymamt>
	<temp_stopamt></temp_stopamt>
	<giroclamt></giroclamt>
	<vistclamt></vistclamt>
	<giroauto_shiftclamt></giroauto_shiftclamt>
	<docard_shiftclamt></docard_shiftclamt>
	<gnrcard_shiftclamt></gnrcard_shiftclamt>
	<onlsetlclamt></onlsetlclamt>
	<etcclamt></etcclamt>
	<un_recp_repm></un_recp_repm>
	<new_repm></new_repm>
	<pre_repm></pre_repm>
	<arealeafclamt></arealeafclamt>
	<teampreisleafclamt></teampreisleafclamt>
	<thmmval_adsc_qty></thmmval_adsc_qty>
	<thmmval_ndsc_qty></thmmval_ndsc_qty>
	<unclamtcnt></unclamtcnt>
	<closmm></closmm>
<%
	}
%>
<%
	}else{
%>


	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>


	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<oprenvclsf></oprenvclsf>
	<rdrnm></rdrnm>
	<rdr_no></rdr_no>
	<qty></qty>
	<addrcdnm></addrcdnm>
	<addrs></addrs>
	<rdrtel_no1></rdrtel_no1>
	<rdrtel_no2></rdrtel_no2>
	<rdrtel_no3></rdrtel_no3>
	<rdrptph_no1></rdrptph_no1>
	<rdrptph_no2></rdrptph_no2>
	<rdrptph_no3></rdrptph_no3>
	<rdr_extndt></rdr_extndt>
	<incmgdt></incmgdt>
	<valmm></valmm>
	<dscnamt></dscnamt>
	<clamtmthd></clamtmthd>
	<rdr_extntype1></rdr_extntype1>
	<rdr_extntype2></rdr_extntype2>
	<camptype></camptype>
	<extnnm></extnnm>
	<stafno></stafno>
	<aplcpath></aplcpath>
	<resitype></resitype>
	<mvindt></mvindt>
	<mvintodt></mvintodt>
	<reconfyn></reconfyn>
	<mormembid></mormembid>
	<rdr_extnprvlastsuspdt></rdr_extnprvlastsuspdt>
	<remk></remk>
	<suspdt></suspdt>
	<suspresn></suspresn>
	<bns_itemclsf></bns_itemclsf>
	<bns_itemnm></bns_itemnm>
	<svcmm></svcmm>
	<scqty></scqty>
	<scsubsuprc></scsubsuprc>
	<hkqty></hkqty>
	<hksubsuprc></hksubsuprc>
	<boyqty></boyqty>
	<boysubsuprc></boysubsuprc>
	<hanqty></hanqty>
	<hansubsuprc></hansubsuprc>
	<trsfdeptnm></trsfdeptnm>
	<trsfbocd></trsfbocd>
	<trsfbonm></trsfbonm>
	<dlvmthd></dlvmthd>
	<post_dlvfee></post_dlvfee>
	<subsuprc></subsuprc>
	<shftyn></shftyn>
	<ccempyn></ccempyn>
	<trgtyn_j></trgtyn_j>
	<thrwyn_j></thrwyn_j>

	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<rdr_no></rdr_no>
	<addr></addr>
	<rdrnm></rdrnm>
	<dstc></dstc>
	<medi></medi>
	<subsbgndd></subsbgndd>
	<valmm></valmm>
	<freeclsf></freeclsf>
	<resitype></resitype>
	<rdrtel_no1></rdrtel_no1>
	<rdrtel_no2></rdrtel_no2>
	<rdrtel_no3></rdrtel_no3>
	<rdrptph_no1></rdrptph_no1>
	<rdrptph_no2></rdrptph_no2>
	<rdrptph_no3></rdrptph_no3>
	<rdr_extndt></rdr_extndt>
	<rdr_extntype1></rdr_extntype1>
	<rdr_extntype2></rdr_extntype2>
	<camprdr_extnnm></camprdr_extnnm>
	<aplcpath></aplcpath>
	<camptype></camptype>
	<extnnm></extnnm>
	<uprc></uprc>
	<qty></qty>
	<clamtmatt></clamtmatt>
	<clamtmonth></clamtmonth>
	<rcntclamt></rcntclamt>
	<totsubsmonth></totsubsmonth>
	<subsmonth200407aft></subsmonth200407aft>
	<clamtmthd></clamtmthd>
	<suspresncd></suspresncd>
	<suspdt></suspdt>
	<vexcboyn></vexcboyn>
	<incmgtm></incmgtm>
	<ccempyn></ccempyn>
	<trgtyn_j></trgtyn_j>

	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<oprenvclsfcd></oprenvclsfcd>
	<sellnetclsf></sellnetclsf>
	<dstccd></dstccd>
	<rdr_extnaplc></rdr_extnaplc>
	<rdr_extnemp></rdr_extnemp>
	<rdr_extnstaf></rdr_extnstaf>
	<rdr_extnrdr_movm></rdr_extnrdr_movm>
	<rdr_extnhdqt></rdr_extnhdqt>
	<rdr_extnexg></rdr_extnexg>
	<rdr_extncnvs></rdr_extncnvs>
	<rdr_extnetc></rdr_extnetc>
	<rdr_extnrate></rdr_extnrate>
	<suspmovm></suspmovm>
	<susprefu></susprefu>
	<suspothnwsp></suspothnwsp>
	<suspetc></suspetc>
	<suspetc1></suspetc1>
	<suspetc2></suspetc2>
	<suspetc3></suspetc3>
	<suspetc4></suspetc4>
	<susprate></susprate>
	<suspaplc></suspaplc>
	<suspemp></suspemp>
	<suspstaf></suspstaf>
	<susprdr_movm></susprdr_movm>
	<susphdqt></susphdqt>
	<suspexg></suspexg>
	<suspcnvsrdr_extn></suspcnvsrdr_extn>
	<suspetcrdr_extn></suspetcrdr_extn>
	<thmmsendqty></thmmsendqty>
	<thmmvalqty></thmmvalqty>
	<aftcnt1></aftcnt1>
	<aftcnt2></aftcnt2>
	<aftcnt3></aftcnt3>
	<aftcnt4></aftcnt4>
	<aftcnt5></aftcnt5>
	<aftcnt6></aftcnt6>
	<excsaftcnt6></excsaftcnt6>
	<aptqty></aptqty>
	<villaqty></villaqty>
	<housqty></housqty>
	<offi_roomqty></offi_roomqty>
	<shopqty></shopqty>
	<etcqty></etcqty>
	<pub_infonwsp></pub_infonwsp>
	<hdqt_dntnwsp></hdqt_dntnwsp>
	<bodntnwsp></bodntnwsp>
	<frc_thrwnwsp></frc_thrwnwsp>
	<etcfreenwsp></etcfreenwsp>
	<resvnwsp></resvnwsp>
	<cupn></cupn>
	<thmmno_valqty></thmmno_valqty>
	<thmmqty></thmmqty>
	<nowun_recpqty></nowun_recpqty>
	<medaqty></medaqty>
	<re_freeqty></re_freeqty>
	<lossqty></lossqty>
	<ppymqty></ppymqty>
	<temp_stopqty></temp_stopqty>
	<now_un_recp_amt></now_un_recp_amt>
	<thmm_amt></thmm_amt>
	<thmmdscnamt></thmmdscnamt>
	<thmmpost_dlvfee></thmmpost_dlvfee>
	<meda_amt></meda_amt>
	<re_freeamt></re_freeamt>
	<lossamt></lossamt>
	<ppymamt></ppymamt>
	<temp_stopamt></temp_stopamt>
	<giroclamt></giroclamt>
	<vistclamt></vistclamt>
	<giroauto_shiftclamt></giroauto_shiftclamt>
	<docard_shiftclamt></docard_shiftclamt>
	<gnrcard_shiftclamt></gnrcard_shiftclamt>
	<onlsetlclamt></onlsetlclamt>
	<etcclamt></etcclamt>
	<un_recp_repm></un_recp_repm>
	<new_repm></new_repm>
	<pre_repm></pre_repm>
	<arealeafclamt></arealeafclamt>
	<teampreisleafclamt></teampreisleafclamt>
	<thmmval_adsc_qty></thmmval_adsc_qty>
	<thmmval_ndsc_qty></thmmval_ndsc_qty>
	<unclamtcnt></unclamtcnt>
	<closmm></closmm>

<%
		}
	}else{
%>


	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>


	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<oprenvclsf></oprenvclsf>
	<rdrnm></rdrnm>
	<rdr_no></rdr_no>
	<qty></qty>
	<addrcdnm></addrcdnm>
	<addrs></addrs>
	<rdrtel_no1></rdrtel_no1>
	<rdrtel_no2></rdrtel_no2>
	<rdrtel_no3></rdrtel_no3>
	<rdrptph_no1></rdrptph_no1>
	<rdrptph_no2></rdrptph_no2>
	<rdrptph_no3></rdrptph_no3>
	<rdr_extndt></rdr_extndt>
	<incmgdt></incmgdt>
	<valmm></valmm>
	<dscnamt></dscnamt>
	<clamtmthd></clamtmthd>
	<rdr_extntype1></rdr_extntype1>
	<rdr_extntype2></rdr_extntype2>
	<camptype></camptype>
	<extnnm></extnnm>
	<stafno></stafno>
	<aplcpath></aplcpath>
	<resitype></resitype>
	<mvindt></mvindt>
	<mvintodt></mvintodt>
	<reconfyn></reconfyn>
	<mormembid></mormembid>
	<rdr_extnprvlastsuspdt></rdr_extnprvlastsuspdt>
	<remk></remk>
	<suspdt></suspdt>
	<suspresn></suspresn>
	<bns_itemclsf></bns_itemclsf>
	<bns_itemnm></bns_itemnm>
	<svcmm></svcmm>
	<scqty></scqty>
	<scsubsuprc></scsubsuprc>
	<hkqty></hkqty>
	<hksubsuprc></hksubsuprc>
	<boyqty></boyqty>
	<boysubsuprc></boysubsuprc>
	<hanqty></hanqty>
	<hansubsuprc></hansubsuprc>
	<trsfdeptnm></trsfdeptnm>
	<trsfbocd></trsfbocd>
	<trsfbonm></trsfbonm>
	<dlvmthd></dlvmthd>
	<post_dlvfee></post_dlvfee>
	<subsuprc></subsuprc>
	<shftyn></shftyn>
	<ccempyn></ccempyn>
	<trgtyn_j></trgtyn_j>
	<thrwyn_j></thrwyn_j>

	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<rdr_no></rdr_no>
	<addr></addr>
	<rdrnm></rdrnm>
	<dstc></dstc>
	<medi></medi>
	<subsbgndd></subsbgndd>
	<valmm></valmm>
	<freeclsf></freeclsf>
	<resitype></resitype>
	<rdrtel_no1></rdrtel_no1>
	<rdrtel_no2></rdrtel_no2>
	<rdrtel_no3></rdrtel_no3>
	<rdrptph_no1></rdrptph_no1>
	<rdrptph_no2></rdrptph_no2>
	<rdrptph_no3></rdrptph_no3>
	<rdr_extndt></rdr_extndt>
	<rdr_extntype1></rdr_extntype1>
	<rdr_extntype2></rdr_extntype2>
	<camprdr_extnnm></camprdr_extnnm>
	<aplcpath></aplcpath>
	<camptype></camptype>
	<extnnm></extnnm>
	<uprc></uprc>
	<qty></qty>
	<clamtmatt></clamtmatt>
	<clamtmonth></clamtmonth>
	<rcntclamt></rcntclamt>
	<totsubsmonth></totsubsmonth>
	<subsmonth200407aft></subsmonth200407aft>
	<clamtmthd></clamtmthd>
	<suspresncd></suspresncd>
	<suspdt></suspdt>
	<vexcboyn></vexcboyn>
	<incmgtm></incmgtm>
	<ccempyn></ccempyn>
	<trgtyn_j></trgtyn_j>

	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<oprenvclsfcd></oprenvclsfcd>
	<sellnetclsf></sellnetclsf>
	<dstccd></dstccd>
	<rdr_extnaplc></rdr_extnaplc>
	<rdr_extnemp></rdr_extnemp>
	<rdr_extnstaf></rdr_extnstaf>
	<rdr_extnrdr_movm></rdr_extnrdr_movm>
	<rdr_extnhdqt></rdr_extnhdqt>
	<rdr_extnexg></rdr_extnexg>
	<rdr_extncnvs></rdr_extncnvs>
	<rdr_extnetc></rdr_extnetc>
	<rdr_extnrate></rdr_extnrate>
	<suspmovm></suspmovm>
	<susprefu></susprefu>
	<suspothnwsp></suspothnwsp>
	<suspetc></suspetc>
	<suspetc1></suspetc1>
	<suspetc2></suspetc2>
	<suspetc3></suspetc3>
	<suspetc4></suspetc4>
	<susprate></susprate>
	<suspaplc></suspaplc>
	<suspemp></suspemp>
	<suspstaf></suspstaf>
	<susprdr_movm></susprdr_movm>
	<susphdqt></susphdqt>
	<suspexg></suspexg>
	<suspcnvsrdr_extn></suspcnvsrdr_extn>
	<suspetcrdr_extn></suspetcrdr_extn>
	<thmmsendqty></thmmsendqty>
	<thmmvalqty></thmmvalqty>
	<aftcnt1></aftcnt1>
	<aftcnt2></aftcnt2>
	<aftcnt3></aftcnt3>
	<aftcnt4></aftcnt4>
	<aftcnt5></aftcnt5>
	<aftcnt6></aftcnt6>
	<excsaftcnt6></excsaftcnt6>
	<aptqty></aptqty>
	<villaqty></villaqty>
	<housqty></housqty>
	<offi_roomqty></offi_roomqty>
	<shopqty></shopqty>
	<etcqty></etcqty>
	<pub_infonwsp></pub_infonwsp>
	<hdqt_dntnwsp></hdqt_dntnwsp>
	<bodntnwsp></bodntnwsp>
	<frc_thrwnwsp></frc_thrwnwsp>
	<etcfreenwsp></etcfreenwsp>
	<resvnwsp></resvnwsp>
	<cupn></cupn>
	<thmmno_valqty></thmmno_valqty>
	<thmmqty></thmmqty>
	<nowun_recpqty></nowun_recpqty>
	<medaqty></medaqty>
	<re_freeqty></re_freeqty>
	<lossqty></lossqty>
	<ppymqty></ppymqty>
	<temp_stopqty></temp_stopqty>
	<now_un_recp_amt></now_un_recp_amt>
	<thmm_amt></thmm_amt>
	<thmmdscnamt></thmmdscnamt>
	<thmmpost_dlvfee></thmmpost_dlvfee>
	<meda_amt></meda_amt>
	<re_freeamt></re_freeamt>
	<lossamt></lossamt>
	<ppymamt></ppymamt>
	<temp_stopamt></temp_stopamt>
	<giroclamt></giroclamt>
	<vistclamt></vistclamt>
	<giroauto_shiftclamt></giroauto_shiftclamt>
	<docard_shiftclamt></docard_shiftclamt>
	<gnrcard_shiftclamt></gnrcard_shiftclamt>
	<onlsetlclamt></onlsetlclamt>
	<etcclamt></etcclamt>
	<un_recp_repm></un_recp_repm>
	<new_repm></new_repm>
	<pre_repm></pre_repm>
	<arealeafclamt></arealeafclamt>
	<teampreisleafclamt></teampreisleafclamt>
	<thmmval_adsc_qty></thmmval_adsc_qty>
	<thmmval_ndsc_qty></thmmval_ndsc_qty>
	<unclamtcnt></unclamtcnt>
	<closmm></closmm>

<%
	}
%>