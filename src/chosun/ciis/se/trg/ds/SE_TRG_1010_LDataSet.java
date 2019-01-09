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


public class SE_TRG_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String colcnt;
	public String title;
	public String trgt;

	public SE_TRG_1010_LDataSet(){}
	public SE_TRG_1010_LDataSet(String errcode, String errmsg, String colcnt, String title, String trgt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.colcnt = colcnt;
		this.title = title;
		this.trgt = trgt;
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

	public void setTrgt(String trgt){
		this.trgt = trgt;
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

	public String getTrgt(){
		return this.trgt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.colcnt = Util.checkString(cstmt.getString(10));
		this.title = Util.checkString(cstmt.getString(11));
		this.trgt = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SE_TRG_1010_LCURLISTRecord rec = new SE_TRG_1010_LCURLISTRecord();
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
	SE_TRG_1010_LDataSet ds = (SE_TRG_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_1010_LCURLISTRecord curlistRec = (SE_TRG_1010_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getColcnt()%>
<%= ds.getTitle()%>
<%= ds.getTrgt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_flnm%>
<%= curlistRec.clos_yn%>
<%= curlistRec.trgt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 20 18:00:54 KST 2009 */