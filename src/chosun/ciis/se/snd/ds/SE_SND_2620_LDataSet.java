/***************************************************************************************************
* ���ϸ� : SE_SND_2620_LDataSet.java
* ��� : �Ǹ�-�߼۰���-���۴ܰ���ȸ
* �ۼ����� : 2009-02-24
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


public class SE_SND_2620_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String title;

	public SE_SND_2620_LDataSet(){}
	public SE_SND_2620_LDataSet(String errcode, String errmsg, String title){
		this.errcode 	= errcode	;
		this.errmsg 	= errmsg	;
		this.title 		= title		;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public String getTitle(){
		return this.title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.title 		= Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_SND_2620_LCURLISTRecord rec = new SE_SND_2620_LCURLISTRecord();
			rec.tran_uprc_cd 		= Util.checkString(rset0.getString("tran_uprc_cd"		));
			rec.aply_dt 			= Util.checkString(rset0.getString("aply_dt"			));
			rec.tran_uprc_clas_nm 	= Util.checkString(rset0.getString("tran_uprc_clas_nm"	));
			rec.route_clsf_nm 		= Util.checkString(rset0.getString("route_clsf_nm"		));
			rec.tran_uprc_route_nm 	= Util.checkString(rset0.getString("tran_uprc_route_nm"	));
			rec.prt_plac_nm 		= Util.checkString(rset0.getString("prt_plac_nm"		));
			rec.load_wgt 			= Util.checkString(rset0.getString("load_wgt"			));
			rec.route_lgth 			= Util.checkString(rset0.getString("route_lgth"			));
			rec.send_plac_nm 		= Util.checkString(rset0.getString("send_plac_nm"		));
			rec.qty 				= Util.checkString(rset0.getString("qty"				));
			rec.tran_cost			= Util.checkString(rset0.getString("tran_cost"			));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_2620_LDataSet ds = (SE_SND_2620_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2620_LCURLISTRecord curlistRec = (SE_SND_2620_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTitle()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.tran_uprc_cd%>
<%= curlistRec.aply_dt%>
<%= curlistRec.tran_uprc_clas_nm%>
<%= curlistRec.route_clsf_nm%>
<%= curlistRec.tran_uprc_route_nm%>
<%= curlistRec.prt_plac_nm%>
<%= curlistRec.load_wgt%>
<%= curlistRec.route_lgth%>
<%= curlistRec.send_plac_nm%>
<%= curlistRec.qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 24 13:25:25 KST 2009 */