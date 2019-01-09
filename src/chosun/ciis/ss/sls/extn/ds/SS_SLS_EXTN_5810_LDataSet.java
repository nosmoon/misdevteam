

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
 

public class SS_SLS_EXTN_5810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList buyerinfo = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5810_LDataSet(){}
	public SS_SLS_EXTN_5810_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			SS_SLS_EXTN_5810_LBUPYERINFORecord rec = new SS_SLS_EXTN_5810_LBUPYERINFORecord();
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.buyer_nm = Util.checkString(rset0.getString("buyer_nm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.buyer_telno1 = Util.checkString(rset0.getString("buyer_telno1"));
			rec.buyer_telno2 = Util.checkString(rset0.getString("buyer_telno2"));
			rec.buyer_telno3 = Util.checkString(rset0.getString("buyer_telno3"));
			rec.buyer_ptphno1 = Util.checkString(rset0.getString("buyer_ptphno1"));
			rec.buyer_ptphno2 = Util.checkString(rset0.getString("buyer_ptphno2"));
			rec.buyer_ptphno3 = Util.checkString(rset0.getString("buyer_ptphno3"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.prodnm = Util.checkString(rset0.getString("prodnm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.campid = Util.checkString(rset0.getString("campid"));
			rec.rcvr_qty = Util.checkString(rset0.getString("rcvr_qty"));
			rec.rcvr_uprc = Util.checkString(rset0.getString("rcvr_uprc"));
			rec.rcvr_amt = Util.checkString(rset0.getString("rcvr_amt"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rcvr_bocd = Util.checkString(rset0.getString("rcvr_bocd"));
			rec.botelno = Util.checkString(rset0.getString("botelno"));
			rec.rcvr_nm = Util.checkString(rset0.getString("rcvr_nm"));
			rec.rcvr_telno1 = Util.checkString(rset0.getString("rcvr_telno1"));
			rec.rcvr_telno2 = Util.checkString(rset0.getString("rcvr_telno2"));
			rec.rcvr_telno3 = Util.checkString(rset0.getString("rcvr_telno3"));
			rec.rcvr_ptphno1 = Util.checkString(rset0.getString("rcvr_ptphno1"));
			rec.rcvr_ptphno2 = Util.checkString(rset0.getString("rcvr_ptphno2"));
			rec.rcvr_ptphno3 = Util.checkString(rset0.getString("rcvr_ptphno3"));
			rec.rcvr_zip = Util.checkString(rset0.getString("rcvr_zip"));
			rec.rcvr_addr = Util.checkString(rset0.getString("rcvr_addr"));
			rec.rcvr_dtlsaddr = Util.checkString(rset0.getString("rcvr_dtlsaddr"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.dlvstat = Util.checkString(rset0.getString("dlvstat"));
			rec.bo_headcnfmdt = Util.checkString(rset0.getString("bo_headcnfmdt"));
			rec.dlvdt = Util.checkString(rset0.getString("dlvdt"));
			rec.errinfo = Util.checkString(rset0.getString("errinfo"));
			rec.pay_mthd = Util.checkString(rset0.getString("pay_mthd"));
			rec.pay_gb = Util.checkString(rset0.getString("pay_gb"));
			rec.bldmngnn = Util.checkString(rset0.getString("bldmngnn"));
			rec.ordr_no = Util.checkString(rset0.getString("ordr_no"));
			rec.rcvr_bonm = Util.checkString(rset0.getString("rcvr_bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.check = Util.checkString("");
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.subscnfmstatcd = Util.checkString(rset0.getString("subscnfmstatcd"));
			rec.aplcpersid = Util.checkString(rset0.getString("aplcpersid"));
			this.buyerinfo.add(rec);
		}
	}

	public String bupyerinfoOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buyerinfo.size();
		for(int i=0; i<size; i++){
			SS_SLS_EXTN_5810_LBUPYERINFORecord rec = (SS_SLS_EXTN_5810_LBUPYERINFORecord)buyerinfo.get(i);
			
			
			String code = rec.buyer_nm;
			String name = rec.rdr_no;
			
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

	public String bupyerinfoChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buyerinfo.size();
		for(int i=0; i<size; i++){
			SS_SLS_EXTN_5810_LBUPYERINFORecord rec = (SS_SLS_EXTN_5810_LBUPYERINFORecord)buyerinfo.get(i);
			
			
			String code = rec.buyer_nm;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("buyer_nm");
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

	public String bupyerinfoRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buyerinfo.size();
		for(int i=0; i<size; i++){
			SS_SLS_EXTN_5810_LBUPYERINFORecord rec = (SS_SLS_EXTN_5810_LBUPYERINFORecord)buyerinfo.get(i);
			
			
			String code = rec.buyer_nm;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("buyer_nm");
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
}