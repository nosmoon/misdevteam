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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_emp_no_001;
	public String xx_emp_no_002;
	public String xx_dept_cd_001;

	public AD_BAS_1100_MDataSet(){}
	public AD_BAS_1100_MDataSet(String errcode, String errmsg, String xx_emp_no_001, String xx_emp_no_002, String xx_dept_cd_001){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_emp_no_001 = xx_emp_no_001;
		this.xx_emp_no_002 = xx_emp_no_002;
		this.xx_dept_cd_001 = xx_dept_cd_001;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_emp_no_001(String xx_emp_no_001){
		this.xx_emp_no_001 = xx_emp_no_001;
	}

	public void setXx_emp_no_002(String xx_emp_no_002){
		this.xx_emp_no_002 = xx_emp_no_002;
	}

	public void setXx_dept_cd_001(String xx_dept_cd_001){
		this.xx_dept_cd_001 = xx_dept_cd_001;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_emp_no_001(){
		return this.xx_emp_no_001;
	}

	public String getXx_emp_no_002(){
		return this.xx_emp_no_002;
	}

	public String getXx_dept_cd_001(){
		return this.xx_dept_cd_001;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			AD_BAS_1100_MCURLIST1Record rec = new AD_BAS_1100_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			AD_BAS_1100_MCURLIST2Record rec = new AD_BAS_1100_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			AD_BAS_1100_MCURLIST3Record rec = new AD_BAS_1100_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			AD_BAS_1100_MCURLIST4Record rec = new AD_BAS_1100_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.curlist4.add(rec);
		}
		this.xx_emp_no_001 = Util.checkString(cstmt.getString(8));
		this.xx_emp_no_002 = Util.checkString(cstmt.getString(9));
		this.xx_dept_cd_001 = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1100_MDataSet ds = (AD_BAS_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_1100_MCURLIST1Record curlist1Rec = (AD_BAS_1100_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_1100_MCURLIST2Record curlist2Rec = (AD_BAS_1100_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_1100_MCURLIST3Record curlist3Rec = (AD_BAS_1100_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_1100_MCURLIST4Record curlist4Rec = (AD_BAS_1100_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getXx_emp_no_001()%>
<%= ds.getXx_emp_no_002()%>
<%= ds.getXx_dept_cd_001()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 18 15:17:26 KST 2012 */