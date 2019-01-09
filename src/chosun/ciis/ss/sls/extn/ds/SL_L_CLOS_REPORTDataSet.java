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


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SL_L_CLOS_REPORTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curbocloscloslist = new ArrayList();
	public ArrayList cursuspcloslist = new ArrayList();
	public ArrayList curextncloslist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_CLOS_REPORTDataSet(){}
	public SL_L_CLOS_REPORTDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord rec = new SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.oprenvclsf = Util.checkString(rset0.getString("oprenvclsf"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.qty = rset0.getInt("qty");
			rec.addrcdnm = Util.checkString(rset0.getString("addrcdnm"));
			rec.addrs = Util.checkString(rset0.getString("addrs"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.dscnamt = rset0.getInt("dscnamt");
			rec.clamtmthd = Util.checkString(rset0.getString("clamtmthd"));
			rec.rdr_extntype1 = Util.checkString(rset0.getString("rdr_extntype1"));
			rec.rdr_extntype2 = Util.checkString(rset0.getString("rdr_extntype2"));
			rec.camptype = Util.checkString(rset0.getString("camptype"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.aplcpath = Util.checkString(rset0.getString("aplcpath"));
			rec.resitype = Util.checkString(rset0.getString("resitype"));
			rec.mvindt = Util.checkString(rset0.getString("mvindt"));
			rec.mvintodt = Util.checkString(rset0.getString("mvintodt"));
			rec.reconfyn = Util.checkString(rset0.getString("reconfyn"));
			rec.mormembid = Util.checkString(rset0.getString("mormembid"));
			rec.rdr_extnprvlastsuspdt = Util.checkString(rset0.getString("rdr_extnprvlastsuspdt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.suspresn = Util.checkString(rset0.getString("suspresn"));
			rec.bns_itemclsf = Util.checkString(rset0.getString("bns_itemclsf"));
			rec.bns_itemnm = Util.checkString(rset0.getString("bns_itemnm"));
			rec.svcmm = rset0.getInt("svcmm");
			rec.scqty = rset0.getInt("scqty");
			rec.scsubsuprc = rset0.getInt("scsubsuprc");
			rec.hkqty = rset0.getInt("hkqty");
			rec.hksubsuprc = rset0.getInt("hksubsuprc");
			rec.boyqty = rset0.getInt("boyqty");
			rec.boysubsuprc = rset0.getInt("boysubsuprc");
			rec.hanqty = rset0.getInt("hanqty");
			rec.hansubsuprc = rset0.getInt("hansubsuprc");
			rec.trsfdeptnm = Util.checkString(rset0.getString("trsfdeptnm"));
			rec.trsfbocd = Util.checkString(rset0.getString("trsfbocd"));
			rec.trsfbonm = Util.checkString(rset0.getString("trsfbonm"));
			rec.dlvmthd = Util.checkString(rset0.getString("dlvmthd"));
			rec.post_dlvfee = rset0.getInt("post_dlvfee");
			rec.subsuprc = rset0.getInt("subsuprc");
			rec.shftyn = Util.checkString(rset0.getString("shftyn"));
			rec.ccempyn = Util.checkString(rset0.getString("ccempyn"));
			rec.trgtyn_j = Util.checkString(rset0.getString("trgtyn_j"));
			rec.thrwyn_j = Util.checkString(rset0.getString("thrwyn_j"));
			this.curextncloslist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord rec = new SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.deptnm = Util.checkString(rset1.getString("deptnm"));
			rec.partcd = Util.checkString(rset1.getString("partcd"));
			rec.partnm = Util.checkString(rset1.getString("partnm"));
			rec.areacd = Util.checkString(rset1.getString("areacd"));
			rec.areanm = Util.checkString(rset1.getString("areanm"));
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.rdr_no = Util.checkString(rset1.getString("rdr_no"));
			rec.addr = Util.checkString(rset1.getString("addr"));
			rec.rdrnm = Util.checkString(rset1.getString("rdrnm"));
			rec.dstc = rset1.getInt("dstc");
			rec.medi = Util.checkString(rset1.getString("medi"));
			rec.subsbgndd = Util.checkString(rset1.getString("subsbgndd"));
			rec.valmm = Util.checkString(rset1.getString("valmm"));
			rec.freeclsf = Util.checkString(rset1.getString("freeclsf"));
			rec.resitype = Util.checkString(rset1.getString("resitype"));
			rec.rdrtel_no1 = Util.checkString(rset1.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset1.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset1.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset1.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset1.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset1.getString("rdrptph_no3"));
			rec.rdr_extndt = Util.checkString(rset1.getString("rdr_extndt"));
			rec.rdr_extntype1 = Util.checkString(rset1.getString("rdr_extntype1"));
			rec.rdr_extntype2 = Util.checkString(rset1.getString("rdr_extntype2"));
			rec.camprdr_extnnm = Util.checkString(rset1.getString("camprdr_extnnm"));
			rec.aplcpath = Util.checkString(rset1.getString("aplcpath"));
			rec.camptype = Util.checkString(rset1.getString("camptype"));
			rec.extnnm = Util.checkString(rset1.getString("extnnm"));
			rec.uprc = rset1.getInt("uprc");
			rec.qty = rset1.getInt("qty");
			rec.clamtmatt = Util.checkString(rset1.getString("clamtmatt"));
			rec.clamtmonth = rset1.getInt("clamtmonth");
			rec.rcntclamt = rset1.getInt("rcntclamt");
			rec.totsubsmonth = Util.checkString(rset1.getString("totsubsmonth"));
			rec.subsmonth200407aft = rset1.getInt("subsmonth200407aft");
			rec.clamtmthd = Util.checkString(rset1.getString("clamtmthd"));
			rec.suspresncd = Util.checkString(rset1.getString("suspresncd"));
			rec.suspdt = Util.checkString(rset1.getString("suspdt"));
			rec.vexcboyn = Util.checkString(rset1.getString("vexcboyn"));
			rec.incmgtm = Util.checkString(rset1.getString("incmgtm"));
			rec.ccempyn = Util.checkString(rset1.getString("ccempyn"));
			rec.trgtyn_j = Util.checkString(rset1.getString("trgtyn_j"));
			rec.thrwyn_j = Util.checkString(rset1.getString("thrwyn_j"));
			this.cursuspcloslist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord rec = new SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord();
			rec.deptcd = Util.checkString(rset2.getString("deptcd"));
			rec.deptnm = Util.checkString(rset2.getString("deptnm"));
			rec.partcd = Util.checkString(rset2.getString("partcd"));
			rec.partnm = Util.checkString(rset2.getString("partnm"));
			rec.areacd = Util.checkString(rset2.getString("areacd"));
			rec.areanm = Util.checkString(rset2.getString("areanm"));
			rec.bocd = Util.checkString(rset2.getString("bocd"));
			rec.bonm = Util.checkString(rset2.getString("bonm"));
			rec.oprenvclsfcd = Util.checkString(rset2.getString("oprenvclsfcd"));
			rec.sellnetclsf = Util.checkString(rset2.getString("sellnetclsf"));
			rec.dstccd = Util.checkString(rset2.getString("dstccd"));
			rec.rdr_extnaplc = rset2.getInt("rdr_extnaplc");
			rec.rdr_extnemp = rset2.getInt("rdr_extnemp");
			rec.rdr_extnstaf = rset2.getInt("rdr_extnstaf");
			rec.rdr_extnrdr_movm = rset2.getInt("rdr_extnrdr_movm");
			rec.rdr_extnhdqt = rset2.getInt("rdr_extnhdqt");
			rec.rdr_extnexg = rset2.getInt("rdr_extnexg");
			rec.rdr_extncnvs = rset2.getInt("rdr_extncnvs");
			rec.rdr_extnetc = rset2.getInt("rdr_extnetc");
			rec.rdr_extnrate = rset2.getInt("rdr_extnrate");
			rec.suspmovm = rset2.getInt("suspmovm");
			rec.susprefu = rset2.getInt("susprefu");
			rec.suspothnwsp = rset2.getInt("suspothnwsp");
			rec.suspetc = rset2.getInt("suspetc");
			rec.suspetc1 = rset2.getInt("suspetc1");
			rec.suspetc2 = rset2.getInt("suspetc2");
			rec.suspetc3 = rset2.getInt("suspetc3");
			rec.suspetc4 = rset2.getInt("suspetc4");
			rec.susprate = rset2.getInt("susprate");
			rec.suspaplc = rset2.getInt("suspaplc");
			rec.suspemp = rset2.getInt("suspemp");
			rec.suspstaf = rset2.getInt("suspstaf");
			rec.susprdr_movm = rset2.getInt("susprdr_movm");
			rec.susphdqt = rset2.getInt("susphdqt");
			rec.suspexg = rset2.getInt("suspexg");
			rec.suspcnvsrdr_extn = rset2.getInt("suspcnvsrdr_extn");
			rec.suspetcrdr_extn = rset2.getInt("suspetcrdr_extn");
			rec.thmmsendqty = rset2.getInt("thmmsendqty");
			rec.thmmvalqty = rset2.getInt("thmmvalqty");
			rec.aftcnt1 = rset2.getInt("aftcnt1");
			rec.aftcnt2 = rset2.getInt("aftcnt2");
			rec.aftcnt3 = rset2.getInt("aftcnt3");
			rec.aftcnt4 = rset2.getInt("aftcnt4");
			rec.aftcnt5 = rset2.getInt("aftcnt5");
			rec.aftcnt6 = rset2.getInt("aftcnt6");
			rec.excsaftcnt6 = rset2.getInt("excsaftcnt6");
			rec.aptqty = rset2.getInt("aptqty");
			rec.villaqty = rset2.getInt("villaqty");
			rec.housqty = rset2.getInt("housqty");
			rec.offi_roomqty = rset2.getInt("offi_roomqty");
			rec.shopqty = rset2.getInt("shopqty");
			rec.etcqty = rset2.getInt("etcqty");
			rec.pub_infonwsp = rset2.getInt("pub_infonwsp");
			rec.hdqt_dntnwsp = rset2.getInt("hdqt_dntnwsp");
			rec.bodntnwsp = rset2.getInt("bodntnwsp");
			rec.frc_thrwnwsp = rset2.getInt("frc_thrwnwsp");
			rec.etcfreenwsp = rset2.getInt("etcfreenwsp");
			rec.resvnwsp = rset2.getInt("resvnwsp");
			rec.cupn = rset2.getInt("cupn");
			rec.thmmno_valqty = rset2.getInt("thmmno_valqty");
			rec.thmmqty = rset2.getInt("thmmqty");
			rec.nowun_recpqty = rset2.getInt("nowun_recpqty");
			rec.medaqty = rset2.getInt("medaqty");
			rec.re_freeqty = rset2.getInt("re_freeqty");
			rec.lossqty = rset2.getInt("lossqty");
			rec.ppymqty = rset2.getInt("ppymqty");
			rec.temp_stopqty = rset2.getInt("temp_stopqty");
			rec.now_un_recp_amt = Util.checkString(rset2.getString("now_un_recp_amt"));
			rec.thmm_amt = rset2.getInt("thmm_amt");
			rec.thmmdscnamt = rset2.getInt("thmmdscnamt");
			rec.thmmpost_dlvfee = rset2.getInt("thmmpost_dlvfee");
			rec.meda_amt = rset2.getInt("meda_amt");
			rec.re_freeamt = rset2.getInt("re_freeamt");
			rec.lossamt = rset2.getInt("lossamt");
			rec.ppymamt = rset2.getInt("ppymamt");
			rec.temp_stopamt = rset2.getInt("temp_stopamt");
			rec.giroclamt = rset2.getInt("giroclamt");
			rec.vistclamt = rset2.getInt("vistclamt");
			rec.giroauto_shiftclamt = rset2.getInt("giroauto_shiftclamt");
			rec.docard_shiftclamt = rset2.getInt("docard_shiftclamt");
			rec.gnrcard_shiftclamt = rset2.getInt("gnrcard_shiftclamt");
			rec.onlsetlclamt = rset2.getInt("onlsetlclamt");
			rec.etcclamt = rset2.getInt("etcclamt");
			rec.un_recp_repm = rset2.getInt("un_recp_repm");
			rec.new_repm = rset2.getInt("new_repm");
			rec.pre_repm = rset2.getInt("pre_repm");
			rec.arealeafclamt = rset2.getInt("arealeafclamt");
			rec.teampreisleafclamt = rset2.getInt("teampreisleafclamt");
			rec.thmmval_adsc_qty = rset2.getInt("thmmval_adsc_qty");
			rec.thmmval_ndsc_qty = rset2.getInt("thmmval_ndsc_qty");
			rec.unclamtcnt = rset2.getInt("unclamtcnt");
			rec.closmm = rset2.getInt("closmm");
			this.curbocloscloslist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_L_CLOS_REPORTDataSet ds = (SL_L_CLOS_REPORTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curextncloslist.size(); i++){
		SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord curextncloslistRec = (SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord)ds.curextncloslist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cursuspcloslist.size(); i++){
		SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord cursuspcloslistRec = (SL_L_CLOS_REPORTCURSUSPCLOSLISTRecord)ds.cursuspcloslist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curbocloscloslist.size(); i++){
		SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord curbocloscloslistRec = (SL_L_CLOS_REPORTCURBOCLOSCLOSLISTRecord)ds.curbocloscloslist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurextncloslist()%>
<%= ds.getCursuspcloslist()%>
<%= ds.getCurbocloscloslist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curextncloslistRec.deptcd%>
<%= curextncloslistRec.deptnm%>
<%= curextncloslistRec.partcd%>
<%= curextncloslistRec.partnm%>
<%= curextncloslistRec.areacd%>
<%= curextncloslistRec.areanm%>
<%= curextncloslistRec.bocd%>
<%= curextncloslistRec.bonm%>
<%= curextncloslistRec.oprenvclsf%>
<%= curextncloslistRec.rdrnm%>
<%= curextncloslistRec.rdr_no%>
<%= curextncloslistRec.qty%>
<%= curextncloslistRec.addrcdnm%>
<%= curextncloslistRec.addrs%>
<%= curextncloslistRec.rdrtel_no1%>
<%= curextncloslistRec.rdrtel_no2%>
<%= curextncloslistRec.rdrtel_no3%>
<%= curextncloslistRec.rdrptph_no1%>
<%= curextncloslistRec.rdrptph_no2%>
<%= curextncloslistRec.rdrptph_no3%>
<%= curextncloslistRec.rdr_extndt%>
<%= curextncloslistRec.incmgdt%>
<%= curextncloslistRec.valmm%>
<%= curextncloslistRec.dscnamt%>
<%= curextncloslistRec.clamtmthd%>
<%= curextncloslistRec.rdr_extntype1%>
<%= curextncloslistRec.rdr_extntype2%>
<%= curextncloslistRec.camptype%>
<%= curextncloslistRec.extnnm%>
<%= curextncloslistRec.stafno%>
<%= curextncloslistRec.aplcpath%>
<%= curextncloslistRec.resitype%>
<%= curextncloslistRec.mvindt%>
<%= curextncloslistRec.mvintodt%>
<%= curextncloslistRec.reconfyn%>
<%= curextncloslistRec.mormembid%>
<%= curextncloslistRec.rdr_extnprvlastsuspdt%>
<%= curextncloslistRec.remk%>
<%= curextncloslistRec.suspdt%>
<%= curextncloslistRec.suspresn%>
<%= curextncloslistRec.bns_itemclsf%>
<%= curextncloslistRec.bns_itemnm%>
<%= curextncloslistRec.svcmm%>
<%= curextncloslistRec.scqty%>
<%= curextncloslistRec.scsubsuprc%>
<%= curextncloslistRec.hkqty%>
<%= curextncloslistRec.hksubsuprc%>
<%= curextncloslistRec.boyqty%>
<%= curextncloslistRec.boysubsuprc%>
<%= curextncloslistRec.hanqty%>
<%= curextncloslistRec.hansubsuprc%>
<%= curextncloslistRec.trsfdeptnm%>
<%= curextncloslistRec.trsfbocd%>
<%= curextncloslistRec.trsfbonm%>
<%= curextncloslistRec.dlvmthd%>
<%= curextncloslistRec.post_dlvfee%>
<%= curextncloslistRec.subsuprc%>
<%= curextncloslistRec.shftyn%>
<%= curextncloslistRec.ccempyn%>
<%= curextncloslistRec.trgtyn_j%>
<%= curextncloslistRec.thrwyn_j%>
<%= cursuspcloslistRec.deptcd%>
<%= cursuspcloslistRec.deptnm%>
<%= cursuspcloslistRec.partcd%>
<%= cursuspcloslistRec.partnm%>
<%= cursuspcloslistRec.areacd%>
<%= cursuspcloslistRec.areanm%>
<%= cursuspcloslistRec.bocd%>
<%= cursuspcloslistRec.bonm%>
<%= cursuspcloslistRec.rdr_no%>
<%= cursuspcloslistRec.addr%>
<%= cursuspcloslistRec.rdrnm%>
<%= cursuspcloslistRec.dstc%>
<%= cursuspcloslistRec.medi%>
<%= cursuspcloslistRec.subsbgndd%>
<%= cursuspcloslistRec.valmm%>
<%= cursuspcloslistRec.freeclsf%>
<%= cursuspcloslistRec.resitype%>
<%= cursuspcloslistRec.rdrtel_no1%>
<%= cursuspcloslistRec.rdrtel_no2%>
<%= cursuspcloslistRec.rdrtel_no3%>
<%= cursuspcloslistRec.rdrptph_no1%>
<%= cursuspcloslistRec.rdrptph_no2%>
<%= cursuspcloslistRec.rdrptph_no3%>
<%= cursuspcloslistRec.rdr_extndt%>
<%= cursuspcloslistRec.rdr_extntype1%>
<%= cursuspcloslistRec.rdr_extntype2%>
<%= cursuspcloslistRec.camprdr_extnnm%>
<%= cursuspcloslistRec.aplcpath%>
<%= cursuspcloslistRec.camptype%>
<%= cursuspcloslistRec.extnnm%>
<%= cursuspcloslistRec.uprc%>
<%= cursuspcloslistRec.qty%>
<%= cursuspcloslistRec.clamtmatt%>
<%= cursuspcloslistRec.clamtmonth%>
<%= cursuspcloslistRec.rcntclamt%>
<%= cursuspcloslistRec.totsubsmonth%>
<%= cursuspcloslistRec.subsmonth200407aft%>
<%= cursuspcloslistRec.clamtmthd%>
<%= cursuspcloslistRec.suspresncd%>
<%= cursuspcloslistRec.suspdt%>
<%= cursuspcloslistRec.vexcboyn%>
<%= cursuspcloslistRec.incmgtm%>
<%= cursuspcloslistRec.ccempyn%>
<%= cursuspcloslistRec.trgtyn_j%>
<%= curbocloscloslistRec.deptcd%>
<%= curbocloscloslistRec.deptnm%>
<%= curbocloscloslistRec.partcd%>
<%= curbocloscloslistRec.partnm%>
<%= curbocloscloslistRec.areacd%>
<%= curbocloscloslistRec.areanm%>
<%= curbocloscloslistRec.bocd%>
<%= curbocloscloslistRec.bonm%>
<%= curbocloscloslistRec.oprenvclsfcd%>
<%= curbocloscloslistRec.sellnetclsf%>
<%= curbocloscloslistRec.dstccd%>
<%= curbocloscloslistRec.rdr_extnaplc%>
<%= curbocloscloslistRec.rdr_extnemp%>
<%= curbocloscloslistRec.rdr_extnstaf%>
<%= curbocloscloslistRec.rdr_extnrdr_movm%>
<%= curbocloscloslistRec.rdr_extnhdqt%>
<%= curbocloscloslistRec.rdr_extnexg%>
<%= curbocloscloslistRec.rdr_extncnvs%>
<%= curbocloscloslistRec.rdr_extnetc%>
<%= curbocloscloslistRec.rdr_extnrate%>
<%= curbocloscloslistRec.suspmovm%>
<%= curbocloscloslistRec.susprefu%>
<%= curbocloscloslistRec.suspothnwsp%>
<%= curbocloscloslistRec.suspetc%>
<%= curbocloscloslistRec.suspetc1%>
<%= curbocloscloslistRec.suspetc2%>
<%= curbocloscloslistRec.suspetc3%>
<%= curbocloscloslistRec.suspetc4%>
<%= curbocloscloslistRec.susprate%>
<%= curbocloscloslistRec.suspaplc%>
<%= curbocloscloslistRec.suspemp%>
<%= curbocloscloslistRec.suspstaf%>
<%= curbocloscloslistRec.susprdr_movm%>
<%= curbocloscloslistRec.susphdqt%>
<%= curbocloscloslistRec.suspexg%>
<%= curbocloscloslistRec.suspcnvsrdr_extn%>
<%= curbocloscloslistRec.suspetcrdr_extn%>
<%= curbocloscloslistRec.thmmsendqty%>
<%= curbocloscloslistRec.thmmvalqty%>
<%= curbocloscloslistRec.aftcnt1%>
<%= curbocloscloslistRec.aftcnt2%>
<%= curbocloscloslistRec.aftcnt3%>
<%= curbocloscloslistRec.aftcnt4%>
<%= curbocloscloslistRec.aftcnt5%>
<%= curbocloscloslistRec.aftcnt6%>
<%= curbocloscloslistRec.excsaftcnt6%>
<%= curbocloscloslistRec.aptqty%>
<%= curbocloscloslistRec.villaqty%>
<%= curbocloscloslistRec.housqty%>
<%= curbocloscloslistRec.offi_roomqty%>
<%= curbocloscloslistRec.shopqty%>
<%= curbocloscloslistRec.etcqty%>
<%= curbocloscloslistRec.pub_infonwsp%>
<%= curbocloscloslistRec.hdqt_dntnwsp%>
<%= curbocloscloslistRec.bodntnwsp%>
<%= curbocloscloslistRec.frc_thrwnwsp%>
<%= curbocloscloslistRec.etcfreenwsp%>
<%= curbocloscloslistRec.resvnwsp%>
<%= curbocloscloslistRec.cupn%>
<%= curbocloscloslistRec.thmmno_valqty%>
<%= curbocloscloslistRec.thmmqty%>
<%= curbocloscloslistRec.nowun_recpqty%>
<%= curbocloscloslistRec.medaqty%>
<%= curbocloscloslistRec.re_freeqty%>
<%= curbocloscloslistRec.lossqty%>
<%= curbocloscloslistRec.ppymqty%>
<%= curbocloscloslistRec.temp_stopqty%>
<%= curbocloscloslistRec.now_un_recp_amt%>
<%= curbocloscloslistRec.thmm_amt%>
<%= curbocloscloslistRec.thmmdscnamt%>
<%= curbocloscloslistRec.thmmpost_dlvfee%>
<%= curbocloscloslistRec.meda_amt%>
<%= curbocloscloslistRec.re_freeamt%>
<%= curbocloscloslistRec.lossamt%>
<%= curbocloscloslistRec.ppymamt%>
<%= curbocloscloslistRec.temp_stopamt%>
<%= curbocloscloslistRec.giroclamt%>
<%= curbocloscloslistRec.vistclamt%>
<%= curbocloscloslistRec.giroauto_shiftclamt%>
<%= curbocloscloslistRec.docard_shiftclamt%>
<%= curbocloscloslistRec.gnrcard_shiftclamt%>
<%= curbocloscloslistRec.onlsetlclamt%>
<%= curbocloscloslistRec.etcclamt%>
<%= curbocloscloslistRec.un_recp_repm%>
<%= curbocloscloslistRec.new_repm%>
<%= curbocloscloslistRec.pre_repm%>
<%= curbocloscloslistRec.arealeafclamt%>
<%= curbocloscloslistRec.teampreisleafclamt%>
<%= curbocloscloslistRec.thmmval_adsc_qty%>
<%= curbocloscloslistRec.thmmval_ndsc_qty%>
<%= curbocloscloslistRec.unclamtcnt%>
<%= curbocloscloslistRec.closmm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 17 13:55:12 KST 2017 */