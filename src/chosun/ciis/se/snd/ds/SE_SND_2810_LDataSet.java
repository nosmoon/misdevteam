/***************************************************************************************************
* ���ϸ� : SE_SND_2810_LDataSet.java
* ��� : �߼۰��� - �������� - �߼����� DOWNLOAD
* �ۼ����� : 2009-03-25
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2810_LDataSet(){}
	public SE_SND_2810_LDataSet(String errcode, String errmsg){
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
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 	= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_SND_2810_LCURLISTRecord rec = new SE_SND_2810_LCURLISTRecord();
			rec.issu_dt 	= Util.checkString(rset0.getString("issu_dt"	));
			rec.tmsg_seq 	= Util.checkString(rset0.getString("tmsg_seq"	));
			rec.tmsg_dt_tm 	= Util.checkString(rset0.getString("tmsg_dt_tm"	));
			rec.flnm	 	= Util.checkString(rset0.getString("flnm"		));
			rec.medi_nm 	= Util.checkString(rset0.getString("medi_nm"	));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_2810_LDataSet ds = (SE_SND_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2810_LCURLISTRecord curlistRec = (SE_SND_2810_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.issu_dt%>
<%= curlistRec.tmsg_seq%>
<%= curlistRec.tmsg_dt_tm%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.medi_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 25 20:29:53 KST 2009 */