/***************************************************************************************************
* ���ϸ� : SE_SND_1930_LDataSet.java
* ��� : �Ǹ�-�߼۰���-�߼۸�����
* �ۼ����� : 2009-02-11
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


public class SE_SND_1930_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList routelist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_1930_LDataSet(){}
	public SE_SND_1930_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_SND_1930_LROUTELISTRecord rec = new SE_SND_1930_LROUTELISTRecord();
			
			rec.cmpy_cd 		= Util.checkString(rset0.getString("cmpy_cd"		));
			rec.route_clsf 		= Util.checkString(rset0.getString("route_clsf"		));
			rec.route_clsf_nm 	= Util.checkString(rset0.getString("route_clsf_nm"	));
			rec.route_cd 		= Util.checkString(rset0.getString("route_cd"		));
			rec.route_nm 		= Util.checkString(rset0.getString("route_nm"		));
			rec.send_rank 		= Util.checkString(rset0.getString("send_rank"		));
			rec.cnsg_seqo 		= Util.checkString(rset0.getString("cnsg_seqo"		));
			rec.use_yn 			= Util.checkString(rset0.getString("use_yn"			));
			this.routelist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_1930_LDataSet ds = (SE_SND_1930_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_SND_1930_LROUTELISTRecord routelistRec = (SE_SND_1930_LROUTELISTRecord)ds.routelist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRoutelist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= routelistRec.cmpy_cd%>
<%= routelistRec.route_clsf%>
<%= routelistRec.route_clsf_nm%>
<%= routelistRec.route_cd%>
<%= routelistRec.route_nm%>
<%= routelistRec.send_rank%>
<%= routelistRec.cnsg_seqo%>
<%= routelistRec.use_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 11 15:16:08 KST 2009 */