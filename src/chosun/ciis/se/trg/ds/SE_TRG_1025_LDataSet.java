/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.trg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1025_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String colcnt;
	public String title;

	public SE_TRG_1025_LDataSet(){}
	public SE_TRG_1025_LDataSet(String errcode, String errmsg, String colcnt, String title){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.colcnt = colcnt;
		this.title = title;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setColcnt(String colcnt){
		this.colcnt = colcnt;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getColcnt(){
		return this.colcnt;
	}

	public String getTitle(){
		return this.title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.colcnt = Util.checkString(cstmt.getString(9));
		this.title = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_TRG_1025_LCURLISTRecord rec = new SE_TRG_1025_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_flnm = Util.checkString(rset0.getString("chrg_flnm"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.trgt = Util.checkString(rset0.getString("trgt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_TRG_1025_LDataSet ds = (SE_TRG_1025_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_1025_LCURLISTRecord curlistRec = (SE_TRG_1025_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getColcnt()%>
<%= ds.getTitle()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_flnm%>
<%= curlistRec.clos_yn%>
<%= curlistRec.trgt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 30 17:18:46 KST 2009 */