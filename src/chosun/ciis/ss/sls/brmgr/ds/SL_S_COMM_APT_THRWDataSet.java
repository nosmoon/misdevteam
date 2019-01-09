/***************************************************************************************************
 * 파일명   : SP_SL_S_COMM_APT_THRW.java
 * 기능     : 투입율조사
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/



package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  투입율조사-현황등록
**/

public class SL_S_COMM_APT_THRWDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList regtypecur2 = new ArrayList();
	public ArrayList dongcur = new ArrayList();
	public ArrayList regtypecur1 = new ArrayList();
	public ArrayList addrcdcur = new ArrayList();
	public ArrayList medicur = new ArrayList();
	public ArrayList dlvstatcur = new ArrayList();
	public ArrayList houscur = new ArrayList();
	public ArrayList apttypecur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String florcnt;
	public String flor_houscnt;
	public String hoscnt;
	public String pyong;
	public String addr;
	public String pyong1;
	public String hoscnt1;
	public String pyong2;
	public String hoscnt2;
	public String pyong3;
	public String hoscnt3;
	public String zip;
	public String invsghhmm;
	public String invsgpers;
	public String addrcdnm;
	public String dongno;
	public String remk;
	public String deptnm;
	public String areanm;
	public String bonm;
	public String addrnm;
	public String cho_cnt;
	public String cho_rate;
	public String jung_cnt;
	public String jung_rate;
	public String dong_cnt;
	public String dong_rate;
	public String other_cnt;
	public String other_rate;
	public String regtype1;
	public String regtype2;
	public String regdt;
	public String mvindt;

	public SL_S_COMM_APT_THRWDataSet(){}
	public SL_S_COMM_APT_THRWDataSet(String errcode, String errmsg, String florcnt, String flor_houscnt, String hoscnt, String pyong, String addr, String pyong1, String hoscnt1, String pyong2, String hoscnt2, String pyong3, String hoscnt3, String zip, String invsghhmm, String invsgpers, String addrcdnm, String dongno, String remk, String deptnm, String areanm, String bonm, String addrnm, String cho_cnt, String cho_rate, String jung_cnt, String jung_rate, String dong_cnt, String dong_rate, String other_cnt, String other_rate, String regtype1, String regtype2, String regdt, String mvindt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.florcnt = florcnt;
		this.flor_houscnt = flor_houscnt;
		this.hoscnt = hoscnt;
		this.pyong = pyong;
		this.addr = addr;
		this.pyong1 = pyong1;
		this.hoscnt1 = hoscnt1;
		this.pyong2 = pyong2;
		this.hoscnt2 = hoscnt2;
		this.pyong3 = pyong3;
		this.hoscnt3 = hoscnt3;
		this.zip = zip;
		this.invsghhmm = invsghhmm;
		this.invsgpers = invsgpers;
		this.addrcdnm = addrcdnm;
		this.dongno = dongno;
		this.remk = remk;
		this.deptnm = deptnm;
		this.areanm = areanm;
		this.bonm = bonm;
		this.addrnm = addrnm;
		this.cho_cnt = cho_cnt;
		this.cho_rate = cho_rate;
		this.jung_cnt = jung_cnt;
		this.jung_rate = jung_rate;
		this.dong_cnt = dong_cnt;
		this.dong_rate = dong_rate;
		this.other_cnt = other_cnt;
		this.other_rate = other_rate;
		this.regtype1 = regtype1;
		this.regtype2 = regtype2;
		this.regdt = regdt;
		this.mvindt = mvindt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFlorcnt(String florcnt){
		this.florcnt = florcnt;
	}

	public void setFlor_houscnt(String flor_houscnt){
		this.flor_houscnt = flor_houscnt;
	}

	public void setHoscnt(String hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setPyong(String pyong){
		this.pyong = pyong;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setPyong1(String pyong1){
		this.pyong1 = pyong1;
	}

	public void setHoscnt1(String hoscnt1){
		this.hoscnt1 = hoscnt1;
	}

	public void setPyong2(String pyong2){
		this.pyong2 = pyong2;
	}

	public void setHoscnt2(String hoscnt2){
		this.hoscnt2 = hoscnt2;
	}

	public void setPyong3(String pyong3){
		this.pyong3 = pyong3;
	}

	public void setHoscnt3(String hoscnt3){
		this.hoscnt3 = hoscnt3;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setInvsghhmm(String invsghhmm){
		this.invsghhmm = invsghhmm;
	}

	public void setInvsgpers(String invsgpers){
		this.invsgpers = invsgpers;
	}

	public void setAddrcdnm(String addrcdnm){
		this.addrcdnm = addrcdnm;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setCho_cnt(String cho_cnt){
		this.cho_cnt = cho_cnt;
	}

	public void setCho_rate(String cho_rate){
		this.cho_rate = cho_rate;
	}

	public void setJung_cnt(String jung_cnt){
		this.jung_cnt = jung_cnt;
	}

	public void setJung_rate(String jung_rate){
		this.jung_rate = jung_rate;
	}

	public void setDong_cnt(String dong_cnt){
		this.dong_cnt = dong_cnt;
	}

	public void setDong_rate(String dong_rate){
		this.dong_rate = dong_rate;
	}

	public void setOther_cnt(String other_cnt){
		this.other_cnt = other_cnt;
	}

	public void setOther_rate(String other_rate){
		this.other_rate = other_rate;
	}

	public void setRegtype1(String regtype1){
		this.regtype1 = regtype1;
	}

	public void setRegtype2(String regtype2){
		this.regtype2 = regtype2;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setMvindt(String mvindt){
		this.mvindt = mvindt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFlorcnt(){
		return this.florcnt;
	}

	public String getFlor_houscnt(){
		return this.flor_houscnt;
	}

	public String getHoscnt(){
		return this.hoscnt;
	}

	public String getPyong(){
		return this.pyong;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getPyong1(){
		return this.pyong1;
	}

	public String getHoscnt1(){
		return this.hoscnt1;
	}

	public String getPyong2(){
		return this.pyong2;
	}

	public String getHoscnt2(){
		return this.hoscnt2;
	}

	public String getPyong3(){
		return this.pyong3;
	}

	public String getHoscnt3(){
		return this.hoscnt3;
	}

	public String getZip(){
		return this.zip;
	}

	public String getInvsghhmm(){
		return this.invsghhmm;
	}

	public String getInvsgpers(){
		return this.invsgpers;
	}

	public String getAddrcdnm(){
		return this.addrcdnm;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getCho_cnt(){
		return this.cho_cnt;
	}

	public String getCho_rate(){
		return this.cho_rate;
	}

	public String getJung_cnt(){
		return this.jung_cnt;
	}

	public String getJung_rate(){
		return this.jung_rate;
	}

	public String getDong_cnt(){
		return this.dong_cnt;
	}

	public String getDong_rate(){
		return this.dong_rate;
	}

	public String getOther_cnt(){
		return this.other_cnt;
	}

	public String getOther_rate(){
		return this.other_rate;
	}

	public String getRegtype1(){
		return this.regtype1;
	}

	public String getRegtype2(){
		return this.regtype2;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getMvindt(){
		return this.mvindt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.florcnt = Util.checkString(cstmt.getString(9));
		this.flor_houscnt = Util.checkString(cstmt.getString(10));
		this.hoscnt = Util.checkString(cstmt.getString(11));
		this.pyong = Util.checkString(cstmt.getString(12));
		this.addr = Util.checkString(cstmt.getString(13));
		this.pyong1 = Util.checkString(cstmt.getString(14));
		this.hoscnt1 = Util.checkString(cstmt.getString(15));
		this.pyong2 = Util.checkString(cstmt.getString(16));
		this.hoscnt2 = Util.checkString(cstmt.getString(17));
		this.pyong3 = Util.checkString(cstmt.getString(18));
		this.hoscnt3 = Util.checkString(cstmt.getString(19));
		this.zip = Util.checkString(cstmt.getString(20));
		this.invsghhmm = Util.checkString(cstmt.getString(21));
		this.invsgpers = Util.checkString(cstmt.getString(22));
		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			SL_S_COMM_APT_THRWAPTTYPECURRecord rec = new SL_S_COMM_APT_THRWAPTTYPECURRecord();
			rec.arow = Util.checkString(rset0.getString("arow"));
			rec.col = Util.checkString(rset0.getString("col"));
			rec.totalrowcol = Util.checkString(rset0.getString("totalrowcol"));
			this.apttypecur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(24);
		while(rset1.next()){
			SL_S_COMM_APT_THRWHOUSCURRecord rec = new SL_S_COMM_APT_THRWHOUSCURRecord();
			rec.medicdnm = Util.checkString(rset1.getString("medicdnm"));
			rec.flor = Util.checkString(rset1.getString("flor"));
			rec.hous = Util.checkString(rset1.getString("hous"));
			this.houscur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(25);
		while(rset2.next()){
			SL_S_COMM_APT_THRWMEDICURRecord rec = new SL_S_COMM_APT_THRWMEDICURRecord();
			rec.medicd = Util.checkString(rset2.getString("medicd"));
			rec.medinm = Util.checkString(rset2.getString("medinm"));
			rec.qty = Util.checkString(rset2.getString("qty"));
			rec.thrwrate = Util.checkString(rset2.getString("thrwrate"));
			rec.bgndlvtm = Util.checkString(rset2.getString("bgndlvtm"));
			rec.enddlvtm = Util.checkString(rset2.getString("enddlvtm"));
			rec.dlvstatcd = Util.checkString(rset2.getString("dlvstatcd"));
			rec.leaffeednosh = Util.checkString(rset2.getString("leaffeednosh"));
			this.medicur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(26);
		while(rset3.next()){
			SL_S_COMM_APT_THRWDLVSTATCURRecord rec = new SL_S_COMM_APT_THRWDLVSTATCURRecord();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.dlvstatcur.add(rec);
		}
		this.addrcdnm = Util.checkString(cstmt.getString(27));
		this.dongno = Util.checkString(cstmt.getString(28));
		this.remk = Util.checkString(cstmt.getString(29));
		this.deptnm = Util.checkString(cstmt.getString(30));
		this.areanm = Util.checkString(cstmt.getString(31));
		this.bonm = Util.checkString(cstmt.getString(32));
		this.addrnm = Util.checkString(cstmt.getString(33));
		this.cho_cnt = Util.checkString(cstmt.getString(34));
		this.cho_rate = Util.checkString(cstmt.getString(35));
		this.jung_cnt = Util.checkString(cstmt.getString(36));
		this.jung_rate = Util.checkString(cstmt.getString(37));
		this.dong_cnt = Util.checkString(cstmt.getString(38));
		this.dong_rate = Util.checkString(cstmt.getString(39));
		this.other_cnt = Util.checkString(cstmt.getString(40));
		this.other_rate = Util.checkString(cstmt.getString(41));
		this.regtype1 = Util.checkString(cstmt.getString(42));
		this.regtype2 = Util.checkString(cstmt.getString(43));
		this.regdt = Util.checkString(cstmt.getString(44));
		this.mvindt = Util.checkString(cstmt.getString(45));
		ResultSet rset4 = (ResultSet) cstmt.getObject(46);
		while(rset4.next()){
			SL_S_COMM_APT_THRWREGTYPECUR1Record rec = new SL_S_COMM_APT_THRWREGTYPECUR1Record();
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.regtypecur1.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(47);
		while(rset5.next()){
			SL_S_COMM_APT_THRWREGTYPECUR2Record rec = new SL_S_COMM_APT_THRWREGTYPECUR2Record();
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.regtypecur2.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(48);
		while(rset6.next()){
			SL_S_COMM_APT_THRWADDRCDCURRecord rec = new SL_S_COMM_APT_THRWADDRCDCURRecord();
			rec.addrcd = Util.checkString(rset6.getString("addrcd"));
			rec.addrnm = Util.checkString(rset6.getString("addrnm"));
			this.addrcdcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(49);
		while(rset7.next()){
			SL_S_COMM_APT_THRWDONGCURRecord rec = new SL_S_COMM_APT_THRWDONGCURRecord();
			rec.addrcd = Util.checkString(rset7.getString("addrcd"));
			rec.dongno = Util.checkString(rset7.getString("dongno"));
			this.dongcur.add(rec);
		}
	}

	public String apttypecurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = apttypecur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWAPTTYPECURRecord rec = (SL_S_COMM_APT_THRWAPTTYPECURRecord)apttypecur.get(i);


			String code = rec.arow;
			String name = rec.col;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String houscurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = houscur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWHOUSCURRecord rec = (SL_S_COMM_APT_THRWHOUSCURRecord)houscur.get(i);


			String code = rec.medicdnm;
			String name = rec.flor;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String medicurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWMEDICURRecord rec = (SL_S_COMM_APT_THRWMEDICURRecord)medicur.get(i);


			String code = rec.medicd;
			String name = rec.medinm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String dlvstatcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWDLVSTATCURRecord rec = (SL_S_COMM_APT_THRWDLVSTATCURRecord)dlvstatcur.get(i);



            String code = rec.cicodeval;
            String name = rec.cicdnm;
//			String code = rec.ciymgbcd;
//			String name = rec.cicdgb;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String regtypecur1OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur1.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWREGTYPECUR1Record rec = (SL_S_COMM_APT_THRWREGTYPECUR1Record)regtypecur1.get(i);


            String code = rec.cicodeval;
            String name = rec.cicdnm;
//			String code = rec.ciymgbcd;
//			String name = rec.cicdgb;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String regtypecur2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur2.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWREGTYPECUR2Record rec = (SL_S_COMM_APT_THRWREGTYPECUR2Record)regtypecur2.get(i);



            String code = rec.cicodeval;
            String name = rec.cicdnm;
//			String code = rec.ciymgbcd;
//			String name = rec.cicdgb;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String addrcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWADDRCDCURRecord rec = (SL_S_COMM_APT_THRWADDRCDCURRecord)addrcdcur.get(i);


			String code = rec.addrcd;
			String name = rec.addrnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String dongcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWDONGCURRecord rec = (SL_S_COMM_APT_THRWDONGCURRecord)dongcur.get(i);


//			String code = rec.addrcd;
            String code = rec.dongno;
			String name = rec.dongno;

			sb.append("<option value=\"");
//			sb.append(code);
            sb.append(name);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String apttypecurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = apttypecur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWAPTTYPECURRecord rec = (SL_S_COMM_APT_THRWAPTTYPECURRecord)apttypecur.get(i);


			String code = rec.arow;
			String name = rec.col;

			sb.append("<input name=\"");
			sb.append("arow");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String houscurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = houscur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWHOUSCURRecord rec = (SL_S_COMM_APT_THRWHOUSCURRecord)houscur.get(i);


			String code = rec.medicdnm;
			String name = rec.flor;

			sb.append("<input name=\"");
			sb.append("medicdnm");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String medicurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWMEDICURRecord rec = (SL_S_COMM_APT_THRWMEDICURRecord)medicur.get(i);


			String code = rec.medicd;
			String name = rec.medinm;

			sb.append("<input name=\"");
			sb.append("medicd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dlvstatcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWDLVSTATCURRecord rec = (SL_S_COMM_APT_THRWDLVSTATCURRecord)dlvstatcur.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String regtypecur1ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur1.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWREGTYPECUR1Record rec = (SL_S_COMM_APT_THRWREGTYPECUR1Record)regtypecur1.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String regtypecur2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur2.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWREGTYPECUR2Record rec = (SL_S_COMM_APT_THRWREGTYPECUR2Record)regtypecur2.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String addrcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWADDRCDCURRecord rec = (SL_S_COMM_APT_THRWADDRCDCURRecord)addrcdcur.get(i);


			String code = rec.addrcd;
			String name = rec.addrnm;

			sb.append("<input name=\"");
			sb.append("addrcd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dongcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWDONGCURRecord rec = (SL_S_COMM_APT_THRWDONGCURRecord)dongcur.get(i);


			String code = rec.addrcd;
			String name = rec.dongno;

			sb.append("<input name=\"");
			sb.append("addrcd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String apttypecurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = apttypecur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWAPTTYPECURRecord rec = (SL_S_COMM_APT_THRWAPTTYPECURRecord)apttypecur.get(i);


			String code = rec.arow;
			String name = rec.col;

			sb.append("<input name=\"");
			sb.append("arow");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String houscurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = houscur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWHOUSCURRecord rec = (SL_S_COMM_APT_THRWHOUSCURRecord)houscur.get(i);


			String code = rec.medicdnm;
			String name = rec.flor;

			sb.append("<input name=\"");
			sb.append("medicdnm");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String medicurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWMEDICURRecord rec = (SL_S_COMM_APT_THRWMEDICURRecord)medicur.get(i);


			String code = rec.medicd;
			String name = rec.medinm;

			sb.append("<input name=\"");
			sb.append("medicd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dlvstatcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWDLVSTATCURRecord rec = (SL_S_COMM_APT_THRWDLVSTATCURRecord)dlvstatcur.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String regtypecur1RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur1.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWREGTYPECUR1Record rec = (SL_S_COMM_APT_THRWREGTYPECUR1Record)regtypecur1.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String regtypecur2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = regtypecur2.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWREGTYPECUR2Record rec = (SL_S_COMM_APT_THRWREGTYPECUR2Record)regtypecur2.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String addrcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWADDRCDCURRecord rec = (SL_S_COMM_APT_THRWADDRCDCURRecord)addrcdcur.get(i);


			String code = rec.addrcd;
			String name = rec.addrnm;

			sb.append("<input name=\"");
			sb.append("addrcd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dongcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dongcur.size();
		for(int i=0; i<size; i++){
			SL_S_COMM_APT_THRWDONGCURRecord rec = (SL_S_COMM_APT_THRWDONGCURRecord)dongcur.get(i);


			String code = rec.addrcd;
			String name = rec.dongno;

			sb.append("<input name=\"");
			sb.append("addrcd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_S_COMM_APT_THRWDataSet ds = (SL_S_COMM_APT_THRWDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.apttypecur.size(); i++){
		SL_S_COMM_APT_THRWAPTTYPECURRecord apttypecurRec = (SL_S_COMM_APT_THRWAPTTYPECURRecord)ds.apttypecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.houscur.size(); i++){
		SL_S_COMM_APT_THRWHOUSCURRecord houscurRec = (SL_S_COMM_APT_THRWHOUSCURRecord)ds.houscur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicur.size(); i++){
		SL_S_COMM_APT_THRWMEDICURRecord medicurRec = (SL_S_COMM_APT_THRWMEDICURRecord)ds.medicur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlvstatcur.size(); i++){
		SL_S_COMM_APT_THRWDLVSTATCURRecord dlvstatcurRec = (SL_S_COMM_APT_THRWDLVSTATCURRecord)ds.dlvstatcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.regtypecur1.size(); i++){
		SL_S_COMM_APT_THRWREGTYPECUR1Record regtypecur1Rec = (SL_S_COMM_APT_THRWREGTYPECUR1Record)ds.regtypecur1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.regtypecur2.size(); i++){
		SL_S_COMM_APT_THRWREGTYPECUR2Record regtypecur2Rec = (SL_S_COMM_APT_THRWREGTYPECUR2Record)ds.regtypecur2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.addrcdcur.size(); i++){
		SL_S_COMM_APT_THRWADDRCDCURRecord addrcdcurRec = (SL_S_COMM_APT_THRWADDRCDCURRecord)ds.addrcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dongcur.size(); i++){
		SL_S_COMM_APT_THRWDONGCURRecord dongcurRec = (SL_S_COMM_APT_THRWDONGCURRecord)ds.dongcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFlorcnt()%>
<%= ds.getFlor_houscnt()%>
<%= ds.getHoscnt()%>
<%= ds.getPyong()%>
<%= ds.getAddr()%>
<%= ds.getPyong1()%>
<%= ds.getHoscnt1()%>
<%= ds.getPyong2()%>
<%= ds.getHoscnt2()%>
<%= ds.getPyong3()%>
<%= ds.getHoscnt3()%>
<%= ds.getZip()%>
<%= ds.getInvsghhmm()%>
<%= ds.getInvsgpers()%>
<%= ds.getApttypecur()%>
<%= ds.getHouscur()%>
<%= ds.getMedicur()%>
<%= ds.getDlvstatcur()%>
<%= ds.getAddrcdnm()%>
<%= ds.getDongno()%>
<%= ds.getRemk()%>
<%= ds.getDeptnm()%>
<%= ds.getAreanm()%>
<%= ds.getBonm()%>
<%= ds.getAddrnm()%>
<%= ds.getCho_cnt()%>
<%= ds.getCho_rate()%>
<%= ds.getJung_cnt()%>
<%= ds.getJung_rate()%>
<%= ds.getDong_cnt()%>
<%= ds.getDong_rate()%>
<%= ds.getOther_cnt()%>
<%= ds.getOther_rate()%>
<%= ds.getRegtype1()%>
<%= ds.getRegtype2()%>
<%= ds.getRegdt()%>
<%= ds.getMvindt()%>
<%= ds.getRegtypecur1()%>
<%= ds.getRegtypecur2()%>
<%= ds.getAddrcdcur()%>
<%= ds.getDongcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= apttypecurRec.arow%>
<%= apttypecurRec.col%>
<%= apttypecurRec.totalrowcol%>
<%= houscurRec.medicdnm%>
<%= houscurRec.flor%>
<%= houscurRec.hous%>
<%= medicurRec.medicd%>
<%= medicurRec.medinm%>
<%= medicurRec.qty%>
<%= medicurRec.thrwrate%>
<%= medicurRec.bgndlvtm%>
<%= medicurRec.enddlvtm%>
<%= medicurRec.dlvstatcd%>
<%= medicurRec.leaffeednosh%>
<%= dlvstatcurRec.ciymgbcd%>
<%= dlvstatcurRec.cicdgb%>
<%= dlvstatcurRec.cicodeval%>
<%= dlvstatcurRec.cicdnm%>
<%= dlvstatcurRec.cicdynm%>
<%= regtypecur1Rec.ciymgbcd%>
<%= regtypecur1Rec.cicdgb%>
<%= regtypecur1Rec.cicodeval%>
<%= regtypecur1Rec.cicdnm%>
<%= regtypecur1Rec.cicdynm%>
<%= regtypecur2Rec.ciymgbcd%>
<%= regtypecur2Rec.cicdgb%>
<%= regtypecur2Rec.cicodeval%>
<%= regtypecur2Rec.cicdnm%>
<%= regtypecur2Rec.cicdynm%>
<%= addrcdcurRec.addrcd%>
<%= addrcdcurRec.addrnm%>
<%= dongcurRec.addrcd%>
<%= dongcurRec.dongno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 13 16:22:03 KST 2006 */
