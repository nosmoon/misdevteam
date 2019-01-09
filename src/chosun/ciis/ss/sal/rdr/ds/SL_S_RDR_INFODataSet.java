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


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 
 */


public class SL_S_RDR_INFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList suspdefcur = new ArrayList();
	public ArrayList bomedicdcur = new ArrayList();
	public ArrayList milgcur = new ArrayList();
	public ArrayList resiclsfcdcur = new ArrayList();
	public ArrayList dstcinfocur = new ArrayList();
	public ArrayList brfcur2 = new ArrayList();
	public ArrayList resitypecdcur = new ArrayList();
	public ArrayList areanocdcur = new ArrayList();
	public ArrayList subscur = new ArrayList();
	public ArrayList paty_clsfcdcur = new ArrayList();
	public ArrayList suspresncdcur = new ArrayList();
	public ArrayList clamtcur = new ArrayList();
	public ArrayList clamtmthdcdcur = new ArrayList();
	public ArrayList dlvmthdcdcur = new ArrayList();
	public ArrayList brfcur = new ArrayList();
	public ArrayList vactcur = new ArrayList();
	public ArrayList rdr_extntypecdcur = new ArrayList();
	public ArrayList ceph1cdcur = new ArrayList();
	public ArrayList subsmonthcur = new ArrayList();
	public ArrayList medicur = new ArrayList();
	public ArrayList readercur = new ArrayList();
	public ArrayList freeclsfcdcur = new ArrayList();
	public ArrayList thrwplaccdcur = new ArrayList();
	public ArrayList addrcdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String prevyymm;
	public String nextyymm;
	public long un_clamt;
	public long un_clamt_mm;
	public String curryymm;
	public long medicnt;
	public long milgcnt;
	public String bnsyn;
	public String memoyn;
	public String rptvbns_item;
	public String rptsuspdt;
	public String rptsuspresn;
	public String medinm;
	public String subsqty;
	public String subscntrcnt;
	public String rdr_val_gb;
	public String onlmembid;

	public SL_S_RDR_INFODataSet(){}
	public SL_S_RDR_INFODataSet(String errcode, String errmsg, String prevyymm, String nextyymm, long un_clamt, long un_clamt_mm, String curryymm, long medicnt, long milgcnt, String bnsyn, String memoyn, String rptvbns_item, String rptsuspdt, String rptsuspresn, String medinm, String subsqty, String subscntrcnt, String rdr_val_gb, String onlmembid){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.prevyymm = prevyymm;
		this.nextyymm = nextyymm;
		this.un_clamt = un_clamt;
		this.un_clamt_mm = un_clamt_mm;
		this.curryymm = curryymm;
		this.medicnt = medicnt;
		this.milgcnt = milgcnt;
		this.bnsyn = bnsyn;
		this.memoyn = memoyn;
		this.rptvbns_item = rptvbns_item;
		this.rptsuspdt = rptsuspdt;
		this.rptsuspresn = rptsuspresn;
		this.medinm = medinm;
		this.subsqty = subsqty;
		this.subscntrcnt = subscntrcnt;
		this.rdr_val_gb = rdr_val_gb;
		this.onlmembid = onlmembid;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPrevyymm(String prevyymm){
		this.prevyymm = prevyymm;
	}

	public void setNextyymm(String nextyymm){
		this.nextyymm = nextyymm;
	}

	public void setUn_clamt(long un_clamt){
		this.un_clamt = un_clamt;
	}

	public void setUn_clamt_mm(long un_clamt_mm){
		this.un_clamt_mm = un_clamt_mm;
	}

	public void setCurryymm(String curryymm){
		this.curryymm = curryymm;
	}

	public void setMedicnt(long medicnt){
		this.medicnt = medicnt;
	}

	public void setMilgcnt(long milgcnt){
		this.milgcnt = milgcnt;
	}

	public void setBnsyn(String bnsyn){
		this.bnsyn = bnsyn;
	}

	public void setMemoyn(String memoyn){
		this.memoyn = memoyn;
	}

	public void setRptvbns_item(String rptvbns_item){
		this.rptvbns_item = rptvbns_item;
	}

	public void setRptsuspdt(String rptsuspdt){
		this.rptsuspdt = rptsuspdt;
	}

	public void setRptsuspresn(String rptsuspresn){
		this.rptsuspresn = rptsuspresn;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public void setSubscntrcnt(String subscntrcnt){
		this.subscntrcnt = subscntrcnt;
	}

	public void setRdr_val_gb(String rdr_val_gb){
		this.rdr_val_gb = rdr_val_gb;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPrevyymm(){
		return this.prevyymm;
	}

	public String getNextyymm(){
		return this.nextyymm;
	}

	public long getUn_clamt(){
		return this.un_clamt;
	}

	public long getUn_clamt_mm(){
		return this.un_clamt_mm;
	}

	public String getCurryymm(){
		return this.curryymm;
	}

	public long getMedicnt(){
		return this.medicnt;
	}

	public long getMilgcnt(){
		return this.milgcnt;
	}

	public String getBnsyn(){
		return this.bnsyn;
	}

	public String getMemoyn(){
		return this.memoyn;
	}

	public String getRptvbns_item(){
		return this.rptvbns_item;
	}

	public String getRptsuspdt(){
		return this.rptsuspdt;
	}

	public String getRptsuspresn(){
		return this.rptsuspresn;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSubsqty(){
		return this.subsqty;
	}

	public String getSubscntrcnt(){
		return this.subscntrcnt;
	}

	public String getRdr_val_gb(){
		return this.rdr_val_gb;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.prevyymm = Util.checkString(cstmt.getString(7));
		this.nextyymm = Util.checkString(cstmt.getString(8));
		this.un_clamt = cstmt.getLong(9);
		this.un_clamt_mm = cstmt.getLong(10);
		this.curryymm = Util.checkString(cstmt.getString(11));
		this.medicnt = cstmt.getLong(12);
		this.milgcnt = cstmt.getLong(13);
		this.bnsyn = Util.checkString(cstmt.getString(14));
		this.memoyn = Util.checkString(cstmt.getString(15));
		this.rptvbns_item = Util.checkString(cstmt.getString(16));
		this.rptsuspdt = Util.checkString(cstmt.getString(17));
		this.rptsuspresn = Util.checkString(cstmt.getString(18));
		this.medinm = Util.checkString(cstmt.getString(19));
		this.subsqty = Util.checkString(cstmt.getString(20));
		this.subscntrcnt = Util.checkString(cstmt.getString(21));
		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			SL_S_RDR_INFOMILGCURRecord rec = new SL_S_RDR_INFOMILGCURRecord();
			rec.on_pont = rset0.getInt("on_pont");
			rec.off_pont = rset0.getInt("off_pont");
			this.milgcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(23);
		while(rset1.next()){
			SL_S_RDR_INFOCLAMTCURRecord rec = new SL_S_RDR_INFOCLAMTCURRecord();
			rec.subsmappli = Util.checkString(rset1.getString("subsmappli"));
			rec.recpdt = Util.checkString(rset1.getString("recpdt"));
			rec.clamamt = rset1.getInt("clamamt");
			rec.clamt = rset1.getInt("clamt");
			rec.rcpmclsfcd = Util.checkString(rset1.getString("rcpmclsfcd"));
			rec.clamtmthdcd = Util.checkString(rset1.getString("clamtmthdcd"));
			rec.rcpmclsfnm = Util.checkString(rset1.getString("rcpmclsfnm"));
			this.clamtcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(24);
		while(rset2.next()){
			SL_S_RDR_INFOBRFCURRecord rec = new SL_S_RDR_INFOBRFCURRecord();
			rec.subsmappli = Util.checkString(rset2.getString("subsmappli"));
			rec.clamtynm = Util.checkString(rset2.getString("clamtynm"));
			this.brfcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(25);
		while(rset3.next()){
			SL_S_RDR_INFOBRFCUR2Record rec = new SL_S_RDR_INFOBRFCUR2Record();
			rec.subsmappli = Util.checkString(rset3.getString("subsmappli"));
			rec.clamtynm = Util.checkString(rset3.getString("clamtynm"));
			this.brfcur2.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(26);
		while(rset4.next()){
			SL_S_RDR_INFOREADERCURRecord rec = new SL_S_RDR_INFOREADERCURRecord();
			rec.rdr_no = Util.checkString(rset4.getString("rdr_no"));
			rec.dlvdstccd = Util.checkString(rset4.getString("dlvdstccd"));
			rec.dlvno = Util.checkString(rset4.getString("dlvno"));
			rec.dlvintvno = Util.checkString(rset4.getString("dlvintvno"));
			rec.dstcnm = Util.checkString(rset4.getString("dstcnm"));
			rec.dlvzip = Util.checkString(rset4.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset4.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset4.getString("dlvdtlsaddr"));
			rec.dlvbnji = Util.checkString(rset4.getString("dlvbnji"));
			rec.dlvcd = Util.checkString(rset4.getString("dlvcd"));
			rec.addrnm = Util.checkString(rset4.getString("addrnm"));
			rec.dlvdong = Util.checkString(rset4.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset4.getString("dlvser_no"));
			rec.pyong = rset4.getInt("pyong");
			rec.rdrnm = Util.checkString(rset4.getString("rdrnm"));
			rec.paty_clsfcd = Util.checkString(rset4.getString("paty_clsfcd"));
			rec.rdrtel_no1 = Util.checkString(rset4.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset4.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset4.getString("rdrtel_no3"));
			rec.resitypecd = Util.checkString(rset4.getString("resitypecd"));
			rec.resiclsfcd = Util.checkString(rset4.getString("resiclsfcd"));
			rec.rdrptph_no1 = Util.checkString(rset4.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset4.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset4.getString("rdrptph_no3"));
			rec.dlvmthdcd = Util.checkString(rset4.getString("dlvmthdcd"));
			rec.thrw_plac = Util.checkString(rset4.getString("thrw_plac"));
			rec.bidt = Util.checkString(rset4.getString("bidt"));
			rec.lusoclsfcd = Util.checkString(rset4.getString("lusoclsfcd"));
			rec.weddanvydt = Util.checkString(rset4.getString("weddanvydt"));
			rec.email = Util.checkString(rset4.getString("email"));
			rec.prn = Util.checkString(rset4.getString("prn"));
			rec.remk = Util.checkString(rset4.getString("remk"));
			rec.etc_post = Util.checkString(rset4.getString("etc_post"));
			rec.oldnewgb = Util.checkString(rset4.getString("oldnewgb"));
			rec.bldmngnn = Util.checkString(rset4.getString("bldmngnn"));
			rec.new_dlvaddr = Util.checkString(rset4.getString("new_dlvaddr"));
			rec.new_jbdlvaddr_fst = Util.checkString(rset4.getString("new_jbdlvaddr_fst"));
			rec.new_jbdlvaddr_lst = Util.checkString(rset4.getString("new_jbdlvaddr_lst"));
			rec.temp_bldmngnn = Util.checkString(rset4.getString("temp_bldmngnn"));
			rec.temp_dlvzip = Util.checkString(rset4.getString("temp_dlvzip"));
			rec.temp_dlvrdaddr = Util.checkString(rset4.getString("temp_dlvrdaddr"));
			rec.temp_dlvjbaddr = Util.checkString(rset4.getString("temp_dlvjbaddr"));
			rec.temp_dlvbnji = Util.checkString(rset4.getString("temp_dlvbnji"));
			this.readercur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(27);
		while(rset5.next()){
			SL_S_RDR_INFOMEDICURRecord rec = new SL_S_RDR_INFOMEDICURRecord();
			rec.medicd = Util.checkString(rset5.getString("medicd"));
			rec.medinm = Util.checkString(rset5.getString("medinm"));
			rec.abrv = Util.checkString(rset5.getString("abrv"));
			rec.dlvqty = rset5.getInt("dlvqty");
			rec.cntrcnt = rset5.getInt("cntrcnt");
			this.medicur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(28);
		while(rset6.next()){
			SL_S_RDR_INFOSUBSCURRecord rec = new SL_S_RDR_INFOSUBSCURRecord();
			rec.medicd = Util.checkString(rset6.getString("medicd"));
			rec.subsamt = rset6.getInt("subsamt");
			rec.clamamt = rset6.getInt("clamamt");
			rec.dscnamt = rset6.getInt("dscnamt");
			rec.post_dlvfee = rset6.getInt("post_dlvfee");
			rec.valqty = rset6.getInt("valqty");
			rec.pre_valqty = rset6.getInt("pre_valqty");
			rec.no_valqty = rset6.getInt("no_valqty");
			rec.rptvfreeclsf = Util.checkString(rset6.getString("rptvfreeclsf"));
			rec.rptvrdr_extndt = Util.checkString(rset6.getString("rptvrdr_extndt"));
			rec.rptvrdr_extntype = Util.checkString(rset6.getString("rptvrdr_extntype"));
			rec.rptvextn = Util.checkString(rset6.getString("rptvextn"));
			rec.rptvsubsdt = Util.checkString(rset6.getString("rptvsubsdt"));
			rec.clamtmthdcd = Util.checkString(rset6.getString("clamtmthdcd"));
			rec.rptvvalmm = Util.checkString(rset6.getString("rptvvalmm"));
			rec.clamtcyclcd = Util.checkString(rset6.getString("clamtcyclcd"));
			rec.rptvrdr_movmdt = Util.checkString(rset6.getString("rptvrdr_movmdt"));
			rec.totrdr_extncost = rset6.getInt("totrdr_extncost");
			rec.rptv_bns_itemnm = Util.checkString(rset6.getString("rptv_bns_itemnm"));
			rec.rptv_suspdt = Util.checkString(rset6.getString("rptv_suspdt"));
			rec.rptv_suspresncd = Util.checkString(rset6.getString("rptv_suspresncd"));
			rec.submedicd = Util.checkString(rset6.getString("submedicd"));
			rec.vact_noprint = Util.checkString(rset6.getString("vact_noprint"));
			rec.pay_reciyn = Util.checkString(rset6.getString("pay_reciyn"));
			rec.target_extn = Util.checkString(rset6.getString("target_extn"));
			this.subscur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(29);
		while(rset7.next()){
			SL_S_RDR_INFODSTCINFOCURRecord rec = new SL_S_RDR_INFODSTCINFOCURRecord();
			rec.dstccd = Util.checkString(rset7.getString("dstccd"));
			rec.dstcnm = Util.checkString(rset7.getString("dstcnm"));
			rec.teamcd = Util.checkString(rset7.getString("teamcd"));
			this.dstcinfocur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(30);
		while(rset8.next()){
			SL_S_RDR_INFOADDRCDCURRecord rec = new SL_S_RDR_INFOADDRCDCURRecord();
			rec.addrcd = Util.checkString(rset8.getString("addrcd"));
			rec.addrnm = Util.checkString(rset8.getString("addrnm"));
			rec.resitypecd = Util.checkString(rset8.getString("resitypecd"));
			rec.addrbnji = Util.checkString(rset8.getString("addrbnji"));
			rec.mvindt = Util.checkString(rset8.getString("mvindt"));
			this.addrcdcur.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(31);
		while(rset9.next()){
			SL_S_RDR_INFOPATY_CLSFCDCURRecord rec = new SL_S_RDR_INFOPATY_CLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset9.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset9.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset9.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset9.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset9.getString("cicdgb"));
			this.paty_clsfcdcur.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(32);
		while(rset10.next()){
			SL_S_RDR_INFOAREANOCDCURRecord rec = new SL_S_RDR_INFOAREANOCDCURRecord();
			rec.cicodeval = Util.checkString(rset10.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset10.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset10.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset10.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset10.getString("cicdgb"));
			this.areanocdcur.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(33);
		while(rset11.next()){
			SL_S_RDR_INFORESITYPECDCURRecord rec = new SL_S_RDR_INFORESITYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset11.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset11.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset11.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset11.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset11.getString("cicdgb"));
			this.resitypecdcur.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(34);
		while(rset12.next()){
			SL_S_RDR_INFORESICLSFCDCURRecord rec = new SL_S_RDR_INFORESICLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset12.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset12.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset12.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset12.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset12.getString("cicdgb"));
			this.resiclsfcdcur.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(35);
		while(rset13.next()){
			SL_S_RDR_INFOCEPH1CDCURRecord rec = new SL_S_RDR_INFOCEPH1CDCURRecord();
			rec.cicodeval = Util.checkString(rset13.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset13.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset13.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset13.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset13.getString("cicdgb"));
			this.ceph1cdcur.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(36);
		while(rset14.next()){
			SL_S_RDR_INFODLVMTHDCDCURRecord rec = new SL_S_RDR_INFODLVMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset14.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset14.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset14.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset14.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset14.getString("cicdgb"));
			this.dlvmthdcdcur.add(rec);
		}
		ResultSet rset15 = (ResultSet) cstmt.getObject(37);
		while(rset15.next()){
			SL_S_RDR_INFOTHRWPLACCDCURRecord rec = new SL_S_RDR_INFOTHRWPLACCDCURRecord();
			rec.cicodeval = Util.checkString(rset15.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset15.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset15.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset15.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset15.getString("cicdgb"));
			this.thrwplaccdcur.add(rec);
		}
		ResultSet rset16 = (ResultSet) cstmt.getObject(38);
		while(rset16.next()){
			SL_S_RDR_INFOBOMEDICDCURRecord rec = new SL_S_RDR_INFOBOMEDICDCURRecord();
			rec.medicd = Util.checkString(rset16.getString("medicd"));
			rec.cicdnm = Util.checkString(rset16.getString("cicdnm"));
			rec.remk = Util.checkString(rset16.getString("remk"));
			rec.areanwspyn = Util.checkString(rset16.getString("areanwspyn"));
			rec.subsuprc = rset16.getInt("subsuprc");
			rec.ciymgbcd = Util.checkString(rset16.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset16.getString("cicdgb"));
			this.bomedicdcur.add(rec);
		}
		ResultSet rset17 = (ResultSet) cstmt.getObject(39);
		while(rset17.next()){
			SL_S_RDR_INFORDR_EXTNTYPECDCURRecord rec = new SL_S_RDR_INFORDR_EXTNTYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset17.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset17.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset17.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset17.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset17.getString("cicdgb"));
			this.rdr_extntypecdcur.add(rec);
		}
		ResultSet rset18 = (ResultSet) cstmt.getObject(40);
		while(rset18.next()){
			SL_S_RDR_INFOCLAMTMTHDCDCURRecord rec = new SL_S_RDR_INFOCLAMTMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset18.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset18.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset18.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset18.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset18.getString("cicdgb"));
			this.clamtmthdcdcur.add(rec);
		}
		ResultSet rset19 = (ResultSet) cstmt.getObject(41);
		while(rset19.next()){
			SL_S_RDR_INFOFREECLSFCDCURRecord rec = new SL_S_RDR_INFOFREECLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset19.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset19.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset19.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset19.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset19.getString("cicdgb"));
			this.freeclsfcdcur.add(rec);
		}
		ResultSet rset20 = (ResultSet) cstmt.getObject(42);
		while(rset20.next()){
			SL_S_RDR_INFOSUSPRESNCDCURRecord rec = new SL_S_RDR_INFOSUSPRESNCDCURRecord();
			rec.cicodeval = Util.checkString(rset20.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset20.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset20.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset20.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset20.getString("cicdgb"));
			this.suspresncdcur.add(rec);
		}
		ResultSet rset21 = (ResultSet) cstmt.getObject(43);
		while(rset21.next()){
			SL_S_RDR_INFOSUBSMONTHCURRecord rec = new SL_S_RDR_INFOSUBSMONTHCURRecord();
			rec.rdr_no = Util.checkString(rset21.getString("rdr_no"));
			rec.realmm = Util.checkString(rset21.getString("realmm"));
			rec.totalmm = Util.checkString(rset21.getString("totalmm"));
			rec.valmm = Util.checkString(rset21.getString("valmm"));
			this.subsmonthcur.add(rec);
		}
		this.rdr_val_gb = Util.checkString(cstmt.getString(44));
		ResultSet rset22 = (ResultSet) cstmt.getObject(45);
		while(rset22.next()){
			SL_S_RDR_INFOSUSPDEFCURRecord rec = new SL_S_RDR_INFOSUSPDEFCURRecord();
			rec.def_type = Util.checkString(rset22.getString("def_type"));
			rec.cns_stat = Util.checkString(rset22.getString("cns_stat"));
			rec.bo_stat = Util.checkString(rset22.getString("bo_stat"));
			rec.cns_cnfmdt = Util.checkString(rset22.getString("cns_cnfmdt"));
			this.suspdefcur.add(rec);
		}
		ResultSet rset23 = (ResultSet) cstmt.getObject(46);
		while(rset23.next()){
			SL_S_RDR_INFOVACTCURRecord rec = new SL_S_RDR_INFOVACTCURRecord();
			rec.bank_cd = Util.checkString(rset23.getString("bank_cd"));
			rec.acct_no = Util.checkString(rset23.getString("acct_no"));
			this.vactcur.add(rec);
		}
		this.onlmembid = Util.checkString(cstmt.getString(47));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_S_RDR_INFODataSet ds = (SL_S_RDR_INFODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.milgcur.size(); i++){
		SL_S_RDR_INFOMILGCURRecord milgcurRec = (SL_S_RDR_INFOMILGCURRecord)ds.milgcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtcur.size(); i++){
		SL_S_RDR_INFOCLAMTCURRecord clamtcurRec = (SL_S_RDR_INFOCLAMTCURRecord)ds.clamtcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.brfcur.size(); i++){
		SL_S_RDR_INFOBRFCURRecord brfcurRec = (SL_S_RDR_INFOBRFCURRecord)ds.brfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.brfcur2.size(); i++){
		SL_S_RDR_INFOBRFCUR2Record brfcur2Rec = (SL_S_RDR_INFOBRFCUR2Record)ds.brfcur2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.readercur.size(); i++){
		SL_S_RDR_INFOREADERCURRecord readercurRec = (SL_S_RDR_INFOREADERCURRecord)ds.readercur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicur.size(); i++){
		SL_S_RDR_INFOMEDICURRecord medicurRec = (SL_S_RDR_INFOMEDICURRecord)ds.medicur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.subscur.size(); i++){
		SL_S_RDR_INFOSUBSCURRecord subscurRec = (SL_S_RDR_INFOSUBSCURRecord)ds.subscur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		SL_S_RDR_INFODSTCINFOCURRecord dstcinfocurRec = (SL_S_RDR_INFODSTCINFOCURRecord)ds.dstcinfocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.addrcdcur.size(); i++){
		SL_S_RDR_INFOADDRCDCURRecord addrcdcurRec = (SL_S_RDR_INFOADDRCDCURRecord)ds.addrcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paty_clsfcdcur.size(); i++){
		SL_S_RDR_INFOPATY_CLSFCDCURRecord paty_clsfcdcurRec = (SL_S_RDR_INFOPATY_CLSFCDCURRecord)ds.paty_clsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.areanocdcur.size(); i++){
		SL_S_RDR_INFOAREANOCDCURRecord areanocdcurRec = (SL_S_RDR_INFOAREANOCDCURRecord)ds.areanocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resitypecdcur.size(); i++){
		SL_S_RDR_INFORESITYPECDCURRecord resitypecdcurRec = (SL_S_RDR_INFORESITYPECDCURRecord)ds.resitypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resiclsfcdcur.size(); i++){
		SL_S_RDR_INFORESICLSFCDCURRecord resiclsfcdcurRec = (SL_S_RDR_INFORESICLSFCDCURRecord)ds.resiclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.ceph1cdcur.size(); i++){
		SL_S_RDR_INFOCEPH1CDCURRecord ceph1cdcurRec = (SL_S_RDR_INFOCEPH1CDCURRecord)ds.ceph1cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlvmthdcdcur.size(); i++){
		SL_S_RDR_INFODLVMTHDCDCURRecord dlvmthdcdcurRec = (SL_S_RDR_INFODLVMTHDCDCURRecord)ds.dlvmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.thrwplaccdcur.size(); i++){
		SL_S_RDR_INFOTHRWPLACCDCURRecord thrwplaccdcurRec = (SL_S_RDR_INFOTHRWPLACCDCURRecord)ds.thrwplaccdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		SL_S_RDR_INFOBOMEDICDCURRecord bomedicdcurRec = (SL_S_RDR_INFOBOMEDICDCURRecord)ds.bomedicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_extntypecdcur.size(); i++){
		SL_S_RDR_INFORDR_EXTNTYPECDCURRecord rdr_extntypecdcurRec = (SL_S_RDR_INFORDR_EXTNTYPECDCURRecord)ds.rdr_extntypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtmthdcdcur.size(); i++){
		SL_S_RDR_INFOCLAMTMTHDCDCURRecord clamtmthdcdcurRec = (SL_S_RDR_INFOCLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.freeclsfcdcur.size(); i++){
		SL_S_RDR_INFOFREECLSFCDCURRecord freeclsfcdcurRec = (SL_S_RDR_INFOFREECLSFCDCURRecord)ds.freeclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.suspresncdcur.size(); i++){
		SL_S_RDR_INFOSUSPRESNCDCURRecord suspresncdcurRec = (SL_S_RDR_INFOSUSPRESNCDCURRecord)ds.suspresncdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.subsmonthcur.size(); i++){
		SL_S_RDR_INFOSUBSMONTHCURRecord subsmonthcurRec = (SL_S_RDR_INFOSUBSMONTHCURRecord)ds.subsmonthcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.suspdefcur.size(); i++){
		SL_S_RDR_INFOSUSPDEFCURRecord suspdefcurRec = (SL_S_RDR_INFOSUSPDEFCURRecord)ds.suspdefcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.vactcur.size(); i++){
		SL_S_RDR_INFOVACTCURRecord vactcurRec = (SL_S_RDR_INFOVACTCURRecord)ds.vactcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPrevyymm()%>
<%= ds.getNextyymm()%>
<%= ds.getUn_clamt()%>
<%= ds.getUn_clamt_mm()%>
<%= ds.getCurryymm()%>
<%= ds.getMedicnt()%>
<%= ds.getMilgcnt()%>
<%= ds.getBnsyn()%>
<%= ds.getMemoyn()%>
<%= ds.getRptvbns_item()%>
<%= ds.getRptsuspdt()%>
<%= ds.getRptsuspresn()%>
<%= ds.getMedinm()%>
<%= ds.getSubsqty()%>
<%= ds.getSubscntrcnt()%>
<%= ds.getMilgcur()%>
<%= ds.getClamtcur()%>
<%= ds.getBrfcur()%>
<%= ds.getBrfcur2()%>
<%= ds.getReadercur()%>
<%= ds.getMedicur()%>
<%= ds.getSubscur()%>
<%= ds.getDstcinfocur()%>
<%= ds.getAddrcdcur()%>
<%= ds.getPaty_clsfcdcur()%>
<%= ds.getAreanocdcur()%>
<%= ds.getResitypecdcur()%>
<%= ds.getResiclsfcdcur()%>
<%= ds.getCeph1cdcur()%>
<%= ds.getDlvmthdcdcur()%>
<%= ds.getThrwplaccdcur()%>
<%= ds.getBomedicdcur()%>
<%= ds.getRdr_extntypecdcur()%>
<%= ds.getClamtmthdcdcur()%>
<%= ds.getFreeclsfcdcur()%>
<%= ds.getSuspresncdcur()%>
<%= ds.getSubsmonthcur()%>
<%= ds.getRdr_val_gb()%>
<%= ds.getSuspdefcur()%>
<%= ds.getVactcur()%>
<%= ds.getOnlmembid()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= milgcurRec.on_pont%>
<%= milgcurRec.off_pont%>
<%= clamtcurRec.subsmappli%>
<%= clamtcurRec.recpdt%>
<%= clamtcurRec.clamamt%>
<%= clamtcurRec.clamt%>
<%= clamtcurRec.rcpmclsfcd%>
<%= clamtcurRec.clamtmthdcd%>
<%= clamtcurRec.rcpmclsfnm%>
<%= brfcurRec.subsmappli%>
<%= brfcurRec.clamtynm%>
<%= brfcur2Rec.subsmappli%>
<%= brfcur2Rec.clamtynm%>
<%= readercurRec.rdr_no%>
<%= readercurRec.dlvdstccd%>
<%= readercurRec.dlvno%>
<%= readercurRec.dlvintvno%>
<%= readercurRec.dstcnm%>
<%= readercurRec.dlvzip%>
<%= readercurRec.dlvaddr%>
<%= readercurRec.dlvdtlsaddr%>
<%= readercurRec.dlvbnji%>
<%= readercurRec.dlvcd%>
<%= readercurRec.addrnm%>
<%= readercurRec.dlvdong%>
<%= readercurRec.dlvser_no%>
<%= readercurRec.pyong%>
<%= readercurRec.rdrnm%>
<%= readercurRec.paty_clsfcd%>
<%= readercurRec.rdrtel_no1%>
<%= readercurRec.rdrtel_no2%>
<%= readercurRec.rdrtel_no3%>
<%= readercurRec.resitypecd%>
<%= readercurRec.resiclsfcd%>
<%= readercurRec.rdrptph_no1%>
<%= readercurRec.rdrptph_no2%>
<%= readercurRec.rdrptph_no3%>
<%= readercurRec.dlvmthdcd%>
<%= readercurRec.thrw_plac%>
<%= readercurRec.bidt%>
<%= readercurRec.lusoclsfcd%>
<%= readercurRec.weddanvydt%>
<%= readercurRec.email%>
<%= readercurRec.prn%>
<%= readercurRec.remk%>
<%= readercurRec.etc_post%>
<%= readercurRec.oldnewgb%>
<%= readercurRec.bldmngnn%>
<%= readercurRec.new_dlvaddr%>
<%= readercurRec.new_jbdlvaddr_fst%>
<%= readercurRec.new_jbdlvaddr_lst%>
<%= readercurRec.temp_bldmngnn%>
<%= readercurRec.temp_dlvzip%>
<%= readercurRec.temp_dlvrdaddr%>
<%= readercurRec.temp_dlvjbaddr%>
<%= readercurRec.temp_dlvbnji%>
<%= medicurRec.medicd%>
<%= medicurRec.medinm%>
<%= medicurRec.abrv%>
<%= medicurRec.dlvqty%>
<%= medicurRec.cntrcnt%>
<%= subscurRec.medicd%>
<%= subscurRec.subsamt%>
<%= subscurRec.clamamt%>
<%= subscurRec.dscnamt%>
<%= subscurRec.post_dlvfee%>
<%= subscurRec.valqty%>
<%= subscurRec.pre_valqty%>
<%= subscurRec.no_valqty%>
<%= subscurRec.rptvfreeclsf%>
<%= subscurRec.rptvrdr_extndt%>
<%= subscurRec.rptvrdr_extntype%>
<%= subscurRec.rptvextn%>
<%= subscurRec.rptvsubsdt%>
<%= subscurRec.clamtmthdcd%>
<%= subscurRec.rptvvalmm%>
<%= subscurRec.clamtcyclcd%>
<%= subscurRec.rptvrdr_movmdt%>
<%= subscurRec.totrdr_extncost%>
<%= subscurRec.rptv_bns_itemnm%>
<%= subscurRec.rptv_suspdt%>
<%= subscurRec.rptv_suspresncd%>
<%= subscurRec.submedicd%>
<%= subscurRec.vact_noprint%>
<%= subscurRec.pay_reciyn%>
<%= subscurRec.target_extn%>
<%= dstcinfocurRec.dstccd%>
<%= dstcinfocurRec.dstcnm%>
<%= dstcinfocurRec.teamcd%>
<%= addrcdcurRec.addrcd%>
<%= addrcdcurRec.addrnm%>
<%= addrcdcurRec.resitypecd%>
<%= addrcdcurRec.addrbnji%>
<%= addrcdcurRec.mvindt%>
<%= paty_clsfcdcurRec.cicodeval%>
<%= paty_clsfcdcurRec.cicdnm%>
<%= paty_clsfcdcurRec.cicdynm%>
<%= paty_clsfcdcurRec.ciymgbcd%>
<%= paty_clsfcdcurRec.cicdgb%>
<%= areanocdcurRec.cicodeval%>
<%= areanocdcurRec.cicdnm%>
<%= areanocdcurRec.cicdynm%>
<%= areanocdcurRec.ciymgbcd%>
<%= areanocdcurRec.cicdgb%>
<%= resitypecdcurRec.cicodeval%>
<%= resitypecdcurRec.cicdnm%>
<%= resitypecdcurRec.cicdynm%>
<%= resitypecdcurRec.ciymgbcd%>
<%= resitypecdcurRec.cicdgb%>
<%= resiclsfcdcurRec.cicodeval%>
<%= resiclsfcdcurRec.cicdnm%>
<%= resiclsfcdcurRec.cicdynm%>
<%= resiclsfcdcurRec.ciymgbcd%>
<%= resiclsfcdcurRec.cicdgb%>
<%= ceph1cdcurRec.cicodeval%>
<%= ceph1cdcurRec.cicdnm%>
<%= ceph1cdcurRec.cicdynm%>
<%= ceph1cdcurRec.ciymgbcd%>
<%= ceph1cdcurRec.cicdgb%>
<%= dlvmthdcdcurRec.cicodeval%>
<%= dlvmthdcdcurRec.cicdnm%>
<%= dlvmthdcdcurRec.cicdynm%>
<%= dlvmthdcdcurRec.ciymgbcd%>
<%= dlvmthdcdcurRec.cicdgb%>
<%= thrwplaccdcurRec.cicodeval%>
<%= thrwplaccdcurRec.cicdnm%>
<%= thrwplaccdcurRec.cicdynm%>
<%= thrwplaccdcurRec.ciymgbcd%>
<%= thrwplaccdcurRec.cicdgb%>
<%= bomedicdcurRec.medicd%>
<%= bomedicdcurRec.cicdnm%>
<%= bomedicdcurRec.remk%>
<%= bomedicdcurRec.areanwspyn%>
<%= bomedicdcurRec.subsuprc%>
<%= bomedicdcurRec.ciymgbcd%>
<%= bomedicdcurRec.cicdgb%>
<%= rdr_extntypecdcurRec.cicodeval%>
<%= rdr_extntypecdcurRec.cicdnm%>
<%= rdr_extntypecdcurRec.cicdynm%>
<%= rdr_extntypecdcurRec.ciymgbcd%>
<%= rdr_extntypecdcurRec.cicdgb%>
<%= clamtmthdcdcurRec.cicodeval%>
<%= clamtmthdcdcurRec.cicdnm%>
<%= clamtmthdcdcurRec.cicdynm%>
<%= clamtmthdcdcurRec.ciymgbcd%>
<%= clamtmthdcdcurRec.cicdgb%>
<%= freeclsfcdcurRec.cicodeval%>
<%= freeclsfcdcurRec.cicdnm%>
<%= freeclsfcdcurRec.cicdynm%>
<%= freeclsfcdcurRec.ciymgbcd%>
<%= freeclsfcdcurRec.cicdgb%>
<%= suspresncdcurRec.cicodeval%>
<%= suspresncdcurRec.cicdnm%>
<%= suspresncdcurRec.cicdynm%>
<%= suspresncdcurRec.ciymgbcd%>
<%= suspresncdcurRec.cicdgb%>
<%= subsmonthcurRec.rdr_no%>
<%= subsmonthcurRec.realmm%>
<%= subsmonthcurRec.totalmm%>
<%= subsmonthcurRec.valmm%>
<%= suspdefcurRec.def_type%>
<%= suspdefcurRec.cns_stat%>
<%= suspdefcurRec.bo_stat%>
<%= suspdefcurRec.cns_cnfmdt%>
<%= vactcurRec.bank_cd%>
<%= vactcurRec.acct_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 11 17:10:57 KST 2017 */