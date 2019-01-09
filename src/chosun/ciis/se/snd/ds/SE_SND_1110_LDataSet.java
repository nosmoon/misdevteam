/***************************************************************************************************
* ���ϸ� : SE_SND_1110_LDataSet.java
* ��� : �Ǹ� - �߼۰��� - �뼱���
 * �ۼ����� : 2009.02.03
 * �ۼ��� :   �����
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
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;
import chosun.ciis.se.snd.rec.SE_SND_1110_LCURLISTRecord;

/**
 * 
 */


public class SE_SND_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String rownum;
	public String errcode;
	public String errmsg;
	
	public SE_SND_1110_LDataSet(){}
	public SE_SND_1110_LDataSet(String errcode, String errmsg){
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

	public String getRownum() {
		return rownum;
	}
	public void setRownum(String rownum) {
		this.rownum = rownum;
	}
	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		this.rownum 	= Util.checkString(cstmt.getString(7));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_SND_1110_LCURLISTRecord rec = new SE_SND_1110_LCURLISTRecord();
			
			rec.cmpy_cd 		= Util.checkString(rset0.getString("cmpy_cd"		));
			rec.medi_cd 		= Util.checkString(rset0.getString("medi_cd"		));
			rec.medi_nm 		= Util.checkString(rset0.getString("medi_nm"		));
			rec.route_cd 		= Util.checkString(rset0.getString("route_cd"		));
			rec.route_nm 		= Util.checkString(rset0.getString("route_nm"		));
			rec.route_clsf 		= Util.checkString(rset0.getString("route_clsf"		));
			rec.prt_plac_cd		= Util.checkString(rset0.getString("prt_plac_cd"	));
			rec.ecnt_cd			= Util.checkString(rset0.getString("ecnt_cd"		));
			rec.ledt_cd			= Util.checkString(rset0.getString("ledt_cd"		));
			rec.inwsp_send_yn 	= Util.checkString(rset0.getString("inwsp_send_yn"	));
			rec.route_rank	 	= Util.checkString(rset0.getString("route_rank"		));
			rec.num			 	= Util.checkString(rset0.getString("num"			));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_1210_LDataSet ds = (SE_SND_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_1210_LCURLISTRecord curlistRec = (SE_SND_1210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.mang_cd_1%>
<%= curlistRec.use_yn%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 19 15:55:59 KST 2009 */