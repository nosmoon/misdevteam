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


public class MT_CLOSE_8004_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_8004_LDataSet(){}
	public MT_CLOSE_8004_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_CLOSE_8004_LCURLIST1Record rec = new MT_CLOSE_8004_LCURLIST1Record();
			rec.irow = Util.checkString(rset0.getString("irow"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.so_irow = Util.checkString(rset0.getString("so_irow"));
			rec.sonm = Util.checkString(rset0.getString("sonm"));
			rec.irow2 = Util.checkString(rset0.getString("irow2"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_CLOSE_8004_LCURLIST2Record rec = new MT_CLOSE_8004_LCURLIST2Record();
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			rec.owh_budg_cd = Util.checkString(rset1.getString("owh_budg_cd"));
			rec.budg_nm = Util.checkString(rset1.getString("budg_nm"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.be_qunt = Util.checkString(rset1.getString("be_qunt"));
			rec.be_amt = Util.checkString(rset1.getString("be_amt"));
			rec.qunt1 = Util.checkString(rset1.getString("qunt1"));
			rec.amt1 = Util.checkString(rset1.getString("amt1"));
			rec.qunt2 = Util.checkString(rset1.getString("qunt2"));
			rec.amt2 = Util.checkString(rset1.getString("amt2"));
			rec.qunt3 = Util.checkString(rset1.getString("qunt3"));
			rec.amt3 = Util.checkString(rset1.getString("amt3"));
			rec.qunt4 = Util.checkString(rset1.getString("qunt4"));
			rec.amt4 = Util.checkString(rset1.getString("amt4"));
			rec.qunt5 = Util.checkString(rset1.getString("qunt5"));
			rec.amt5 = Util.checkString(rset1.getString("amt5"));
			rec.qunt6 = Util.checkString(rset1.getString("qunt6"));
			rec.amt6 = Util.checkString(rset1.getString("amt6"));
			rec.qunt7 = Util.checkString(rset1.getString("qunt7"));
			rec.amt7 = Util.checkString(rset1.getString("amt7"));
			rec.qunt8 = Util.checkString(rset1.getString("qunt8"));
			rec.amt8 = Util.checkString(rset1.getString("amt8"));
			rec.qunt9 = Util.checkString(rset1.getString("qunt9"));
			rec.amt9 = Util.checkString(rset1.getString("amt9"));
			rec.qunt10 = Util.checkString(rset1.getString("qunt10"));
			rec.amt10 = Util.checkString(rset1.getString("amt10"));
			rec.qunt11 = Util.checkString(rset1.getString("qunt11"));
			rec.amt11 = Util.checkString(rset1.getString("amt11"));
			rec.qunt12 = Util.checkString(rset1.getString("qunt12"));
			rec.amt12 = Util.checkString(rset1.getString("amt12"));
			rec.qunt13 = Util.checkString(rset1.getString("qunt13"));
			rec.amt13 = Util.checkString(rset1.getString("amt13"));
			rec.qunt14 = Util.checkString(rset1.getString("qunt14"));
			rec.amt14 = Util.checkString(rset1.getString("amt14"));
			rec.qunt15 = Util.checkString(rset1.getString("qunt15"));
			rec.amt15 = Util.checkString(rset1.getString("amt15"));
			rec.qunt16 = Util.checkString(rset1.getString("qunt16"));
			rec.amt16 = Util.checkString(rset1.getString("amt16"));
			rec.qunt17 = Util.checkString(rset1.getString("qunt17"));
			rec.amt17 = Util.checkString(rset1.getString("amt17"));
			rec.qunt18 = Util.checkString(rset1.getString("qunt18"));
			rec.amt18 = Util.checkString(rset1.getString("amt18"));
			rec.qunt19 = Util.checkString(rset1.getString("qunt19"));
			rec.amt19 = Util.checkString(rset1.getString("amt19"));
			rec.qunt20 = Util.checkString(rset1.getString("qunt20"));
			rec.amt20 = Util.checkString(rset1.getString("amt20"));
			rec.qunt21 = Util.checkString(rset1.getString("qunt21"));
			rec.amt21 = Util.checkString(rset1.getString("amt21"));
			rec.qunt22 = Util.checkString(rset1.getString("qunt22"));
			rec.amt22 = Util.checkString(rset1.getString("amt22"));
			rec.qunt23 = Util.checkString(rset1.getString("qunt23"));
			rec.amt23 = Util.checkString(rset1.getString("amt23"));
			rec.qunt24 = Util.checkString(rset1.getString("qunt24"));
			rec.amt24 = Util.checkString(rset1.getString("amt24"));
			rec.qunt25 = Util.checkString(rset1.getString("qunt25"));
			rec.amt25 = Util.checkString(rset1.getString("amt25"));
			rec.qunt26 = Util.checkString(rset1.getString("qunt26"));
			rec.amt26 = Util.checkString(rset1.getString("amt26"));
			rec.qunt27 = Util.checkString(rset1.getString("qunt27"));
			rec.amt27 = Util.checkString(rset1.getString("amt27"));
			rec.qunt28 = Util.checkString(rset1.getString("qunt28"));
			rec.amt28 = Util.checkString(rset1.getString("amt28"));
			rec.qunt29 = Util.checkString(rset1.getString("qunt29"));
			rec.amt29 = Util.checkString(rset1.getString("amt29"));
			rec.qunt30 = Util.checkString(rset1.getString("qunt30"));
			rec.amt30 = Util.checkString(rset1.getString("amt30"));
			rec.qunt31 = Util.checkString(rset1.getString("qunt31"));
			rec.amt31 = Util.checkString(rset1.getString("amt31"));
			rec.qunt32 = Util.checkString(rset1.getString("qunt32"));
			rec.amt32 = Util.checkString(rset1.getString("amt32"));
			rec.qunt33 = Util.checkString(rset1.getString("qunt33"));
			rec.amt33 = Util.checkString(rset1.getString("amt33"));
			rec.qunt34 = Util.checkString(rset1.getString("qunt34"));
			rec.amt34 = Util.checkString(rset1.getString("amt34"));
			rec.qunt35 = Util.checkString(rset1.getString("qunt35"));
			rec.amt35 = Util.checkString(rset1.getString("amt35"));
			rec.qunt36 = Util.checkString(rset1.getString("qunt36"));
			rec.amt36 = Util.checkString(rset1.getString("amt36"));
			rec.qunt37 = Util.checkString(rset1.getString("qunt37"));
			rec.amt37 = Util.checkString(rset1.getString("amt37"));
			rec.qunt38 = Util.checkString(rset1.getString("qunt38"));
			rec.amt38 = Util.checkString(rset1.getString("amt38"));
			rec.qunt39 = Util.checkString(rset1.getString("qunt39"));
			rec.amt39 = Util.checkString(rset1.getString("amt39"));
			rec.qunt40 = Util.checkString(rset1.getString("qunt40"));
			rec.amt40 = Util.checkString(rset1.getString("amt40"));
			rec.qunt41 = Util.checkString(rset1.getString("qunt41"));
			rec.amt41 = Util.checkString(rset1.getString("amt41"));
			rec.qunt42 = Util.checkString(rset1.getString("qunt42"));
			rec.amt42 = Util.checkString(rset1.getString("amt42"));
			rec.qunt43 = Util.checkString(rset1.getString("qunt43"));
			rec.amt43 = Util.checkString(rset1.getString("amt43"));
			rec.qunt44 = Util.checkString(rset1.getString("qunt44"));
			rec.amt44 = Util.checkString(rset1.getString("amt44"));
			rec.qunt45 = Util.checkString(rset1.getString("qunt45"));
			rec.amt45 = Util.checkString(rset1.getString("amt45"));
			rec.qunt46 = Util.checkString(rset1.getString("qunt46"));
			rec.amt46 = Util.checkString(rset1.getString("amt46"));
			rec.qunt47 = Util.checkString(rset1.getString("qunt47"));
			rec.amt47 = Util.checkString(rset1.getString("amt47"));
			rec.qunt48 = Util.checkString(rset1.getString("qunt48"));
			rec.amt48 = Util.checkString(rset1.getString("amt48"));
			rec.qunt49 = Util.checkString(rset1.getString("qunt49"));
			rec.amt49 = Util.checkString(rset1.getString("amt49"));
			rec.qunt50 = Util.checkString(rset1.getString("qunt50"));
			rec.amt50 = Util.checkString(rset1.getString("amt50"));
			rec.qunt51 = Util.checkString(rset1.getString("qunt51"));
			rec.amt51 = Util.checkString(rset1.getString("amt51"));
			rec.qunt52 = Util.checkString(rset1.getString("qunt52"));
			rec.amt52 = Util.checkString(rset1.getString("amt52"));
			rec.qunt53 = Util.checkString(rset1.getString("qunt53"));
			rec.amt53 = Util.checkString(rset1.getString("amt53"));
			rec.qunt54 = Util.checkString(rset1.getString("qunt54"));
			rec.amt54 = Util.checkString(rset1.getString("amt54"));
			rec.qunt55 = Util.checkString(rset1.getString("qunt55"));
			rec.amt55 = Util.checkString(rset1.getString("amt55"));
			rec.qunt56 = Util.checkString(rset1.getString("qunt56"));
			rec.amt56 = Util.checkString(rset1.getString("amt56"));
			rec.qunt57 = Util.checkString(rset1.getString("qunt57"));
			rec.amt57 = Util.checkString(rset1.getString("amt57"));
			rec.qunt58 = Util.checkString(rset1.getString("qunt58"));
			rec.amt58 = Util.checkString(rset1.getString("amt58"));
			rec.qunt59 = Util.checkString(rset1.getString("qunt59"));
			rec.amt59 = Util.checkString(rset1.getString("amt59"));
			rec.qunt60 = Util.checkString(rset1.getString("qunt60"));
			rec.amt60 = Util.checkString(rset1.getString("amt60"));
			rec.qunt61 = Util.checkString(rset1.getString("qunt61"));
			rec.amt61 = Util.checkString(rset1.getString("amt61"));
			rec.qunt62 = Util.checkString(rset1.getString("qunt62"));
			rec.amt62 = Util.checkString(rset1.getString("amt62"));
			rec.qunt63 = Util.checkString(rset1.getString("qunt63"));
			rec.amt63 = Util.checkString(rset1.getString("amt63"));
			rec.qunt64 = Util.checkString(rset1.getString("qunt64"));
			rec.amt64 = Util.checkString(rset1.getString("amt64"));
			rec.qunt65 = Util.checkString(rset1.getString("qunt65"));
			rec.amt65 = Util.checkString(rset1.getString("amt65"));
			rec.qunt66 = Util.checkString(rset1.getString("qunt66"));
			rec.amt66 = Util.checkString(rset1.getString("amt66"));
			rec.qunt67 = Util.checkString(rset1.getString("qunt67"));
			rec.amt67 = Util.checkString(rset1.getString("amt67"));
			rec.qunt68 = Util.checkString(rset1.getString("qunt68"));
			rec.amt68 = Util.checkString(rset1.getString("amt68"));
			rec.qunt69 = Util.checkString(rset1.getString("qunt69"));
			rec.amt69 = Util.checkString(rset1.getString("amt69"));
			rec.qunt70 = Util.checkString(rset1.getString("qunt70"));
			rec.amt70 = Util.checkString(rset1.getString("amt70"));
			rec.qunt71 = Util.checkString(rset1.getString("qunt71"));
			rec.amt71 = Util.checkString(rset1.getString("amt71"));
			rec.qunt72 = Util.checkString(rset1.getString("qunt72"));
			rec.amt72 = Util.checkString(rset1.getString("amt72"));
			rec.qunt73 = Util.checkString(rset1.getString("qunt73"));
			rec.amt73 = Util.checkString(rset1.getString("amt73"));
			rec.qunt74 = Util.checkString(rset1.getString("qunt74"));
			rec.amt74 = Util.checkString(rset1.getString("amt74"));
			rec.qunt75 = Util.checkString(rset1.getString("qunt75"));
			rec.amt75 = Util.checkString(rset1.getString("amt75"));
			rec.qunt76 = Util.checkString(rset1.getString("qunt76"));
			rec.amt76 = Util.checkString(rset1.getString("amt76"));
			rec.qunt77 = Util.checkString(rset1.getString("qunt77"));
			rec.amt77 = Util.checkString(rset1.getString("amt77"));
			rec.qunt78 = Util.checkString(rset1.getString("qunt78"));
			rec.amt78 = Util.checkString(rset1.getString("amt78"));
			rec.qunt79 = Util.checkString(rset1.getString("qunt79"));
			rec.amt79 = Util.checkString(rset1.getString("amt79"));
			rec.qunt80 = Util.checkString(rset1.getString("qunt80"));
			rec.amt80 = Util.checkString(rset1.getString("amt80"));
			rec.qunt81 = Util.checkString(rset1.getString("qunt81"));
			rec.amt81 = Util.checkString(rset1.getString("amt81"));
			rec.qunt82 = Util.checkString(rset1.getString("qunt82"));
			rec.amt82 = Util.checkString(rset1.getString("amt82"));
			rec.qunt83 = Util.checkString(rset1.getString("qunt83"));
			rec.amt83 = Util.checkString(rset1.getString("amt83"));
			rec.qunt84 = Util.checkString(rset1.getString("qunt84"));
			rec.amt84 = Util.checkString(rset1.getString("amt84"));
			rec.qunt85 = Util.checkString(rset1.getString("qunt85"));
			rec.amt85 = Util.checkString(rset1.getString("amt85"));
			rec.qunt86 = Util.checkString(rset1.getString("qunt86"));
			rec.amt86 = Util.checkString(rset1.getString("amt86"));
			rec.qunt87 = Util.checkString(rset1.getString("qunt87"));
			rec.amt87 = Util.checkString(rset1.getString("amt87"));
			rec.qunt88 = Util.checkString(rset1.getString("qunt88"));
			rec.amt88 = Util.checkString(rset1.getString("amt88"));
			rec.qunt89 = Util.checkString(rset1.getString("qunt89"));
			rec.amt89 = Util.checkString(rset1.getString("amt89"));
			rec.qunt90 = Util.checkString(rset1.getString("qunt90"));
			rec.amt90 = Util.checkString(rset1.getString("amt90"));
			rec.qunt91 = Util.checkString(rset1.getString("qunt91"));
			rec.amt91 = Util.checkString(rset1.getString("amt91"));
			rec.qunt92 = Util.checkString(rset1.getString("qunt92"));
			rec.amt92 = Util.checkString(rset1.getString("amt92"));
			rec.qunt93 = Util.checkString(rset1.getString("qunt93"));
			rec.amt93 = Util.checkString(rset1.getString("amt93"));
			rec.qunt94 = Util.checkString(rset1.getString("qunt94"));
			rec.amt94 = Util.checkString(rset1.getString("amt94"));
			rec.qunt95 = Util.checkString(rset1.getString("qunt95"));
			rec.amt95 = Util.checkString(rset1.getString("amt95"));
			rec.qunt96 = Util.checkString(rset1.getString("qunt96"));
			rec.amt96 = Util.checkString(rset1.getString("amt96"));
			rec.qunt97 = Util.checkString(rset1.getString("qunt97"));
			rec.amt97 = Util.checkString(rset1.getString("amt97"));
			rec.qunt98 = Util.checkString(rset1.getString("qunt98"));
			rec.amt98 = Util.checkString(rset1.getString("amt98"));
			rec.qunt99 = Util.checkString(rset1.getString("qunt99"));
			rec.amt99 = Util.checkString(rset1.getString("amt99"));
			rec.qunt100 = Util.checkString(rset1.getString("qunt100"));
			rec.amt100 = Util.checkString(rset1.getString("amt100"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_8004_LDataSet ds = (MT_CLOSE_8004_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_CLOSE_8004_LCURLIST1Record curlist1Rec = (MT_CLOSE_8004_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_CLOSE_8004_LCURLIST2Record curlist2Rec = (MT_CLOSE_8004_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.sect_nm%>
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
<%= curlist2Rec.qunt51%>
<%= curlist2Rec.amt51%>
<%= curlist2Rec.qunt52%>
<%= curlist2Rec.amt52%>
<%= curlist2Rec.qunt53%>
<%= curlist2Rec.amt53%>
<%= curlist2Rec.qunt54%>
<%= curlist2Rec.amt54%>
<%= curlist2Rec.qunt55%>
<%= curlist2Rec.amt55%>
<%= curlist2Rec.qunt56%>
<%= curlist2Rec.amt56%>
<%= curlist2Rec.qunt57%>
<%= curlist2Rec.amt57%>
<%= curlist2Rec.qunt58%>
<%= curlist2Rec.amt58%>
<%= curlist2Rec.qunt59%>
<%= curlist2Rec.amt59%>
<%= curlist2Rec.qunt60%>
<%= curlist2Rec.amt60%>
<%= curlist2Rec.qunt61%>
<%= curlist2Rec.amt61%>
<%= curlist2Rec.qunt62%>
<%= curlist2Rec.amt62%>
<%= curlist2Rec.qunt63%>
<%= curlist2Rec.amt63%>
<%= curlist2Rec.qunt64%>
<%= curlist2Rec.amt64%>
<%= curlist2Rec.qunt65%>
<%= curlist2Rec.amt65%>
<%= curlist2Rec.qunt66%>
<%= curlist2Rec.amt66%>
<%= curlist2Rec.qunt67%>
<%= curlist2Rec.amt67%>
<%= curlist2Rec.qunt68%>
<%= curlist2Rec.amt68%>
<%= curlist2Rec.qunt69%>
<%= curlist2Rec.amt69%>
<%= curlist2Rec.qunt70%>
<%= curlist2Rec.amt70%>
<%= curlist2Rec.qunt71%>
<%= curlist2Rec.amt71%>
<%= curlist2Rec.qunt72%>
<%= curlist2Rec.amt72%>
<%= curlist2Rec.qunt73%>
<%= curlist2Rec.amt73%>
<%= curlist2Rec.qunt74%>
<%= curlist2Rec.amt74%>
<%= curlist2Rec.qunt75%>
<%= curlist2Rec.amt75%>
<%= curlist2Rec.qunt76%>
<%= curlist2Rec.amt76%>
<%= curlist2Rec.qunt77%>
<%= curlist2Rec.amt77%>
<%= curlist2Rec.qunt78%>
<%= curlist2Rec.amt78%>
<%= curlist2Rec.qunt79%>
<%= curlist2Rec.amt79%>
<%= curlist2Rec.qunt80%>
<%= curlist2Rec.amt80%>
<%= curlist2Rec.qunt81%>
<%= curlist2Rec.amt81%>
<%= curlist2Rec.qunt82%>
<%= curlist2Rec.amt82%>
<%= curlist2Rec.qunt83%>
<%= curlist2Rec.amt83%>
<%= curlist2Rec.qunt84%>
<%= curlist2Rec.amt84%>
<%= curlist2Rec.qunt85%>
<%= curlist2Rec.amt85%>
<%= curlist2Rec.qunt86%>
<%= curlist2Rec.amt86%>
<%= curlist2Rec.qunt87%>
<%= curlist2Rec.amt87%>
<%= curlist2Rec.qunt88%>
<%= curlist2Rec.amt88%>
<%= curlist2Rec.qunt89%>
<%= curlist2Rec.amt89%>
<%= curlist2Rec.qunt90%>
<%= curlist2Rec.amt90%>
<%= curlist2Rec.qunt91%>
<%= curlist2Rec.amt91%>
<%= curlist2Rec.qunt92%>
<%= curlist2Rec.amt92%>
<%= curlist2Rec.qunt93%>
<%= curlist2Rec.amt93%>
<%= curlist2Rec.qunt94%>
<%= curlist2Rec.amt94%>
<%= curlist2Rec.qunt95%>
<%= curlist2Rec.amt95%>
<%= curlist2Rec.qunt96%>
<%= curlist2Rec.amt96%>
<%= curlist2Rec.qunt97%>
<%= curlist2Rec.amt97%>
<%= curlist2Rec.qunt98%>
<%= curlist2Rec.amt98%>
<%= curlist2Rec.qunt99%>
<%= curlist2Rec.amt99%>
<%= curlist2Rec.qunt100%>
<%= curlist2Rec.amt100%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 21:11:55 KST 2009 */