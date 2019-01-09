/***************************************************************************************************
* ���ϸ� : SE_SND_3410_LDataSet.java
* ��� : �Ǹ� - �߼۰��� - ��ǥ�뼱, �뼱 ����
* �ۼ����� : 2009-05-14
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


public class SE_SND_3410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_3410_LDataSet(){}
	public SE_SND_3410_LDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_SND_3410_LCURLISTRecord rec = new SE_SND_3410_LCURLISTRecord();
			rec.cmpy_cd 		= Util.checkString(rset0.getString("cmpy_cd"		));
			rec.rptv_route_clsf = Util.checkString(rset0.getString("rptv_route_clsf"));
			rec.rptv_route_cd 	= Util.checkString(rset0.getString("rptv_route_cd"	));
			rec.rptv_route_nm 	= Util.checkString(rset0.getString("rptv_route_nm"	));
			rec.route_rank 		= Util.checkString(rset0.getString("route_rank"		));
			rec.prt_plac_cd 	= Util.checkString(rset0.getString("prt_plac_cd"	));
			rec.ecnt_cd 		= Util.checkString(rset0.getString("ecnt_cd"		));
			rec.ledt_cd 		= Util.checkString(rset0.getString("ledt_cd"		));
			rec.qty 			= Util.checkString(rset0.getString("qty"			));
			rec.route_cnt 		= Util.checkString(rset0.getString("route_cnt"		));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_3410_LDataSet ds = (SE_SND_3410_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_3410_LCURLISTRecord curlistRec = (SE_SND_3410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.rptv_route_clsf%>
<%= curlistRec.rptv_route_cd%>
<%= curlistRec.rptv_route_nm%>
<%= curlistRec.route_rank%>
<%= curlistRec.prt_plac_cd%>
<%= curlistRec.ecnt_cd%>
<%= curlistRec.ledt_cd%>
<%= curlistRec.route_cd%>
<%= curlistRec.qty%>
<%= curlistRec.route_cnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 14 14:32:14 KST 2009 */