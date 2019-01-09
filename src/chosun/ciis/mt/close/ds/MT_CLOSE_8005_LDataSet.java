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


package chosun.ciis.mt.close.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_8005_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_8005_LDataSet(){}
	public MT_CLOSE_8005_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			MT_CLOSE_8005_LCURLIST1Record rec = new MT_CLOSE_8005_LCURLIST1Record();
			rec.irow = Util.checkString(rset2.getString("irow"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset2.getString("medi_nm"));
			rec.so_irow = Util.checkString(rset2.getString("so_irow"));
			rec.sonm = Util.checkString(rset2.getString("sonm"));
			rec.irow2 = Util.checkString(rset2.getString("irow2"));
			this.curlist1.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			MT_CLOSE_8005_LCURLIST2Record rec = new MT_CLOSE_8005_LCURLIST2Record();
			rec.fac_clsf = Util.checkString(rset3.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset3.getString("fac_clsf_nm"));
			rec.owh_budg_cd = Util.checkString(rset3.getString("owh_budg_cd"));
			rec.budg_nm = Util.checkString(rset3.getString("budg_nm"));
			rec.matr_cd = Util.checkString(rset3.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset3.getString("matr_nm"));
			rec.be_qunt = Util.checkString(rset3.getString("be_qunt"));
			rec.be_amt = Util.checkString(rset3.getString("be_amt"));
			rec.qunt1 = Util.checkString(rset3.getString("qunt1"));
			rec.amt1 = Util.checkString(rset3.getString("amt1"));
			rec.qunt2 = Util.checkString(rset3.getString("qunt2"));
			rec.amt2 = Util.checkString(rset3.getString("amt2"));
			rec.qunt3 = Util.checkString(rset3.getString("qunt3"));
			rec.amt3 = Util.checkString(rset3.getString("amt3"));
			rec.qunt4 = Util.checkString(rset3.getString("qunt4"));
			rec.amt4 = Util.checkString(rset3.getString("amt4"));
			rec.qunt5 = Util.checkString(rset3.getString("qunt5"));
			rec.amt5 = Util.checkString(rset3.getString("amt5"));
			rec.qunt6 = Util.checkString(rset3.getString("qunt6"));
			rec.amt6 = Util.checkString(rset3.getString("amt6"));
			rec.qunt7 = Util.checkString(rset3.getString("qunt7"));
			rec.amt7 = Util.checkString(rset3.getString("amt7"));
			rec.qunt8 = Util.checkString(rset3.getString("qunt8"));
			rec.amt8 = Util.checkString(rset3.getString("amt8"));
			rec.qunt9 = Util.checkString(rset3.getString("qunt9"));
			rec.amt9 = Util.checkString(rset3.getString("amt9"));
			rec.qunt10 = Util.checkString(rset3.getString("qunt10"));
			rec.amt10 = Util.checkString(rset3.getString("amt10"));
			rec.qunt11 = Util.checkString(rset3.getString("qunt11"));
			rec.amt11 = Util.checkString(rset3.getString("amt11"));
			rec.qunt12 = Util.checkString(rset3.getString("qunt12"));
			rec.amt12 = Util.checkString(rset3.getString("amt12"));
			rec.qunt13 = Util.checkString(rset3.getString("qunt13"));
			rec.amt13 = Util.checkString(rset3.getString("amt13"));
			rec.qunt14 = Util.checkString(rset3.getString("qunt14"));
			rec.amt14 = Util.checkString(rset3.getString("amt14"));
			rec.qunt15 = Util.checkString(rset3.getString("qunt15"));
			rec.amt15 = Util.checkString(rset3.getString("amt15"));
			rec.qunt16 = Util.checkString(rset3.getString("qunt16"));
			rec.amt16 = Util.checkString(rset3.getString("amt16"));
			rec.qunt17 = Util.checkString(rset3.getString("qunt17"));
			rec.amt17 = Util.checkString(rset3.getString("amt17"));
			rec.qunt18 = Util.checkString(rset3.getString("qunt18"));
			rec.amt18 = Util.checkString(rset3.getString("amt18"));
			rec.qunt19 = Util.checkString(rset3.getString("qunt19"));
			rec.amt19 = Util.checkString(rset3.getString("amt19"));
			rec.qunt20 = Util.checkString(rset3.getString("qunt20"));
			rec.amt20 = Util.checkString(rset3.getString("amt20"));
			rec.qunt21 = Util.checkString(rset3.getString("qunt21"));
			rec.amt21 = Util.checkString(rset3.getString("amt21"));
			rec.qunt22 = Util.checkString(rset3.getString("qunt22"));
			rec.amt22 = Util.checkString(rset3.getString("amt22"));
			rec.qunt23 = Util.checkString(rset3.getString("qunt23"));
			rec.amt23 = Util.checkString(rset3.getString("amt23"));
			rec.qunt24 = Util.checkString(rset3.getString("qunt24"));
			rec.amt24 = Util.checkString(rset3.getString("amt24"));
			rec.qunt25 = Util.checkString(rset3.getString("qunt25"));
			rec.amt25 = Util.checkString(rset3.getString("amt25"));
			rec.qunt26 = Util.checkString(rset3.getString("qunt26"));
			rec.amt26 = Util.checkString(rset3.getString("amt26"));
			rec.qunt27 = Util.checkString(rset3.getString("qunt27"));
			rec.amt27 = Util.checkString(rset3.getString("amt27"));
			rec.qunt28 = Util.checkString(rset3.getString("qunt28"));
			rec.amt28 = Util.checkString(rset3.getString("amt28"));
			rec.qunt29 = Util.checkString(rset3.getString("qunt29"));
			rec.amt29 = Util.checkString(rset3.getString("amt29"));
			rec.qunt30 = Util.checkString(rset3.getString("qunt30"));
			rec.amt30 = Util.checkString(rset3.getString("amt30"));
			rec.qunt31 = Util.checkString(rset3.getString("qunt31"));
			rec.amt31 = Util.checkString(rset3.getString("amt31"));
			rec.qunt32 = Util.checkString(rset3.getString("qunt32"));
			rec.amt32 = Util.checkString(rset3.getString("amt32"));
			rec.qunt33 = Util.checkString(rset3.getString("qunt33"));
			rec.amt33 = Util.checkString(rset3.getString("amt33"));
			rec.qunt34 = Util.checkString(rset3.getString("qunt34"));
			rec.amt34 = Util.checkString(rset3.getString("amt34"));
			rec.qunt35 = Util.checkString(rset3.getString("qunt35"));
			rec.amt35 = Util.checkString(rset3.getString("amt35"));
			rec.qunt36 = Util.checkString(rset3.getString("qunt36"));
			rec.amt36 = Util.checkString(rset3.getString("amt36"));
			rec.qunt37 = Util.checkString(rset3.getString("qunt37"));
			rec.amt37 = Util.checkString(rset3.getString("amt37"));
			rec.qunt38 = Util.checkString(rset3.getString("qunt38"));
			rec.amt38 = Util.checkString(rset3.getString("amt38"));
			rec.qunt39 = Util.checkString(rset3.getString("qunt39"));
			rec.amt39 = Util.checkString(rset3.getString("amt39"));
			rec.qunt40 = Util.checkString(rset3.getString("qunt40"));
			rec.amt40 = Util.checkString(rset3.getString("amt40"));
			rec.qunt41 = Util.checkString(rset3.getString("qunt41"));
			rec.amt41 = Util.checkString(rset3.getString("amt41"));
			rec.qunt42 = Util.checkString(rset3.getString("qunt42"));
			rec.amt42 = Util.checkString(rset3.getString("amt42"));
			rec.qunt43 = Util.checkString(rset3.getString("qunt43"));
			rec.amt43 = Util.checkString(rset3.getString("amt43"));
			rec.qunt44 = Util.checkString(rset3.getString("qunt44"));
			rec.amt44 = Util.checkString(rset3.getString("amt44"));
			rec.qunt45 = Util.checkString(rset3.getString("qunt45"));
			rec.amt45 = Util.checkString(rset3.getString("amt45"));
			rec.qunt46 = Util.checkString(rset3.getString("qunt46"));
			rec.amt46 = Util.checkString(rset3.getString("amt46"));
			rec.qunt47 = Util.checkString(rset3.getString("qunt47"));
			rec.amt47 = Util.checkString(rset3.getString("amt47"));
			rec.qunt48 = Util.checkString(rset3.getString("qunt48"));
			rec.amt48 = Util.checkString(rset3.getString("amt48"));
			rec.qunt49 = Util.checkString(rset3.getString("qunt49"));
			rec.amt49 = Util.checkString(rset3.getString("amt49"));
			rec.qunt50 = Util.checkString(rset3.getString("qunt50"));
			rec.amt50 = Util.checkString(rset3.getString("amt50"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_8005_LDataSet ds = (MT_CLOSE_8005_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_CLOSE_8005_LCURLIST1Record curlist1Rec = (MT_CLOSE_8005_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_CLOSE_8005_LCURLIST2Record curlist2Rec = (MT_CLOSE_8005_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.irow%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.so_irow%>
<%= curlist1Rec.sonm%>
<%= curlist1Rec.irow2%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.fac_clsf_nm%>
<%= curlist2Rec.owh_budg_cd%>
<%= curlist2Rec.budg_nm%>
<%= curlist2Rec.matr_cd%>
<%= curlist2Rec.matr_nm%>
<%= curlist2Rec.be_qunt%>
<%= curlist2Rec.be_amt%>
<%= curlist2Rec.qunt1%>
<%= curlist2Rec.amt1%>
<%= curlist2Rec.qunt2%>
<%= curlist2Rec.amt2%>
<%= curlist2Rec.qunt3%>
<%= curlist2Rec.amt3%>
<%= curlist2Rec.qunt4%>
<%= curlist2Rec.amt4%>
<%= curlist2Rec.qunt5%>
<%= curlist2Rec.amt5%>
<%= curlist2Rec.qunt6%>
<%= curlist2Rec.amt6%>
<%= curlist2Rec.qunt7%>
<%= curlist2Rec.amt7%>
<%= curlist2Rec.qunt8%>
<%= curlist2Rec.amt8%>
<%= curlist2Rec.qunt9%>
<%= curlist2Rec.amt9%>
<%= curlist2Rec.qunt10%>
<%= curlist2Rec.amt10%>
<%= curlist2Rec.qunt11%>
<%= curlist2Rec.amt11%>
<%= curlist2Rec.qunt12%>
<%= curlist2Rec.amt12%>
<%= curlist2Rec.qunt13%>
<%= curlist2Rec.amt13%>
<%= curlist2Rec.qunt14%>
<%= curlist2Rec.amt14%>
<%= curlist2Rec.qunt15%>
<%= curlist2Rec.amt15%>
<%= curlist2Rec.qunt16%>
<%= curlist2Rec.amt16%>
<%= curlist2Rec.qunt17%>
<%= curlist2Rec.amt17%>
<%= curlist2Rec.qunt18%>
<%= curlist2Rec.amt18%>
<%= curlist2Rec.qunt19%>
<%= curlist2Rec.amt19%>
<%= curlist2Rec.qunt20%>
<%= curlist2Rec.amt20%>
<%= curlist2Rec.qunt21%>
<%= curlist2Rec.amt21%>
<%= curlist2Rec.qunt22%>
<%= curlist2Rec.amt22%>
<%= curlist2Rec.qunt23%>
<%= curlist2Rec.amt23%>
<%= curlist2Rec.qunt24%>
<%= curlist2Rec.amt24%>
<%= curlist2Rec.qunt25%>
<%= curlist2Rec.amt25%>
<%= curlist2Rec.qunt26%>
<%= curlist2Rec.amt26%>
<%= curlist2Rec.qunt27%>
<%= curlist2Rec.amt27%>
<%= curlist2Rec.qunt28%>
<%= curlist2Rec.amt28%>
<%= curlist2Rec.qunt29%>
<%= curlist2Rec.amt29%>
<%= curlist2Rec.qunt30%>
<%= curlist2Rec.amt30%>
<%= curlist2Rec.qunt31%>
<%= curlist2Rec.amt31%>
<%= curlist2Rec.qunt32%>
<%= curlist2Rec.amt32%>
<%= curlist2Rec.qunt33%>
<%= curlist2Rec.amt33%>
<%= curlist2Rec.qunt34%>
<%= curlist2Rec.amt34%>
<%= curlist2Rec.qunt35%>
<%= curlist2Rec.amt35%>
<%= curlist2Rec.qunt36%>
<%= curlist2Rec.amt36%>
<%= curlist2Rec.qunt37%>
<%= curlist2Rec.amt37%>
<%= curlist2Rec.qunt38%>
<%= curlist2Rec.amt38%>
<%= curlist2Rec.qunt39%>
<%= curlist2Rec.amt39%>
<%= curlist2Rec.qunt40%>
<%= curlist2Rec.amt40%>
<%= curlist2Rec.qunt41%>
<%= curlist2Rec.amt41%>
<%= curlist2Rec.qunt42%>
<%= curlist2Rec.amt42%>
<%= curlist2Rec.qunt43%>
<%= curlist2Rec.amt43%>
<%= curlist2Rec.qunt44%>
<%= curlist2Rec.amt44%>
<%= curlist2Rec.qunt45%>
<%= curlist2Rec.amt45%>
<%= curlist2Rec.qunt46%>
<%= curlist2Rec.amt46%>
<%= curlist2Rec.qunt47%>
<%= curlist2Rec.amt47%>
<%= curlist2Rec.qunt48%>
<%= curlist2Rec.amt48%>
<%= curlist2Rec.qunt49%>
<%= curlist2Rec.amt49%>
<%= curlist2Rec.qunt50%>
<%= curlist2Rec.amt50%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 15:14:38 KST 2009 */