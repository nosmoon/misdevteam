/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.brn.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.brn.rec.AD_BRN_2040_SCURLIST1Record;
import chosun.ciis.ad.brn.rec.AD_BRN_2040_SCURLIST2Record;
import java.io.Reader;
import java.io.IOException;;

/**
 * 
 */


public class AD_BRN_2040_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String page_id;

	public AD_BRN_2040_SDataSet(){}
	public AD_BRN_2040_SDataSet(String errcode, String errmsg, String page_id){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.page_id = page_id;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPage_id(String page_id){
		this.page_id = page_id;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPage_id(){
		return this.page_id;
	}
	
	
	public static String readStreamToString(Reader reader){
        StringBuffer data = new StringBuffer();
        char[] buf = new char[1024];
        int cnt = 0;
        if (null != reader) {
            try {
				while ( (cnt = reader.read(buf)) != -1) {
				    data.append(buf, 0, cnt);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return data.toString();
    }

 
	 
	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}
		
		this.page_id = Util.checkString(cstmt.getString(8));
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		
		while(rset0.next()){
			AD_BRN_2040_SCURLIST1Record rec = new AD_BRN_2040_SCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.rept_clsf = Util.checkString(rset0.getString("rept_clsf"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.rept_no = rset0.getInt("rept_no");
			rec.advcs_clsf = Util.checkString(rset0.getString("advcs_clsf"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.data_clsf = Util.checkString(rset0.getString("data_clsf"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.patr_chrg_pers = Util.checkString(rset0.getString("patr_chrg_pers"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.taem_chf_opn = Util.checkString(rset0.getString("taem_chf_opn"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.cont = readStreamToString(rset0.getCharacterStream("cont")); //Util.checkString(); 
			
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			AD_BRN_2040_SCURLIST2Record rec = new AD_BRN_2040_SCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.rept_clsf = Util.checkString(rset1.getString("rept_clsf"));
			rec.make_dt = Util.checkString(rset1.getString("make_dt"));
			rec.rept_no = rset1.getInt("rept_no");
			rec.add_file_no = rset1.getInt("add_file_no");
			rec.add_file_nm = Util.checkString(rset1.getString("add_file_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BRN_2040_SDataSet ds = (AD_BRN_2040_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BRN_2040_SCURLIST1Record curlist1Rec = (AD_BRN_2040_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BRN_2040_SCURLIST2Record curlist2Rec = (AD_BRN_2040_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPage_id()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.rept_clsf%>
<%= curlist1Rec.make_dt%>
<%= curlist1Rec.rept_no%>
<%= curlist1Rec.advcs_clsf%>
<%= curlist1Rec.medi_clsf%>
<%= curlist1Rec.data_clsf%>
<%= curlist1Rec.chrg_pers%>
<%= curlist1Rec.dlco_no%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.patr_chrg_pers%>
<%= curlist1Rec.titl%>
<%= curlist1Rec.cont%>
<%= curlist1Rec.taem_chf_opn%>
<%= curlist1Rec.incmg_dt_tm%>
<%= curlist1Rec.chg_dt_tm%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.rept_clsf%>
<%= curlist2Rec.make_dt%>
<%= curlist2Rec.rept_no%>
<%= curlist2Rec.add_file_no%>
<%= curlist2Rec.add_file_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 09:36:40 KST 2009 */