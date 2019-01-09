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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import java.io.IOException;
import java.io.Reader;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_6010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public MT_COMMATR_6010_LDataSet(){}
	public MT_COMMATR_6010_LDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
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
		
		this.totalcnt = cstmt.getLong(14);
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		
		while(rset0.next()){
			MT_COMMATR_6010_LCURLISTRecord rec = new MT_COMMATR_6010_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.patr_chrg_pers = Util.checkString(rset0.getString("patr_chrg_pers"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.cont = readStreamToString(rset0.getCharacterStream("cont"));
			rec.tag = Util.checkString(rset0.getString("tag"));
			rec.team_chf_yn = Util.checkString(rset0.getString("team_chf_yn"));
			rec.file_yn = Util.checkString(rset0.getString("file_yn"));
			rec.w_file_yn = Util.checkString(rset0.getString("w_file_yn"));
			rec.p_file_yn = Util.checkString(rset0.getString("p_file_yn"));
			rec.add_file_no1 = Util.checkString(rset0.getString("add_file_no1"));
			rec.add_file_nm1 = Util.checkString(rset0.getString("add_file_nm1"));
			rec.add_file_no2 = Util.checkString(rset0.getString("add_file_no2"));
			rec.add_file_nm2 = Util.checkString(rset0.getString("add_file_nm2"));
			rec.add_file_no3 = Util.checkString(rset0.getString("add_file_no3"));
			rec.add_file_nm3 = Util.checkString(rset0.getString("add_file_nm3"));
			rec.add_file_no4 = Util.checkString(rset0.getString("add_file_no4"));
			rec.add_file_nm4 = Util.checkString(rset0.getString("add_file_nm4"));
			rec.add_file_no5 = Util.checkString(rset0.getString("add_file_no5"));
			rec.add_file_nm5 = Util.checkString(rset0.getString("add_file_nm5"));
			rec.add_file_no6 = Util.checkString(rset0.getString("add_file_no6"));
			rec.add_file_nm6 = Util.checkString(rset0.getString("add_file_nm6"));
			rec.add_file_no7 = Util.checkString(rset0.getString("add_file_no7"));
			rec.add_file_nm7 = Util.checkString(rset0.getString("add_file_nm7"));
			rec.add_file_no8 = Util.checkString(rset0.getString("add_file_no8"));
			rec.add_file_nm8 = Util.checkString(rset0.getString("add_file_nm8"));
			rec.add_file_no9 = Util.checkString(rset0.getString("add_file_no9"));
			rec.add_file_nm9 = Util.checkString(rset0.getString("add_file_nm9"));
			rec.add_file_no10 = Util.checkString(rset0.getString("add_file_no10"));
			rec.add_file_nm10 = Util.checkString(rset0.getString("add_file_nm10"));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_6010_LDataSet ds = (MT_COMMATR_6010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_6010_LCURLISTRecord curlistRec = (MT_COMMATR_6010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_clsf_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.dlco_no%>
<%= curlistRec.patr_chrg_pers%>
<%= curlistRec.titl%>
<%= curlistRec.cont%>
<%= curlistRec.tag%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 21 19:16:40 KST 2012 */