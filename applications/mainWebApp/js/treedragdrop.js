function getLastChildItemIndex(itemIndex, treeItemNodeSet, treeItemDepthNodename, winObj) 
{
	if( winObj == null )
		winObj = window;

	var curDepthValue = winObj.model.getValue(treeItemNodeSet + "[" + (itemIndex + 1) + "]/"+treeItemDepthNodename);
	var childDepthValue = winObj.model.getValue(treeItemNodeSet + "[" + (itemIndex + 2) + "]/"+treeItemDepthNodename);
	
	while(curDepthValue < childDepthValue)
	{
		itemIndex++;
		childDepthValue = winObj.model.getValue(treeItemNodeSet + "[" + (itemIndex + 2) + "]/"+treeItemDepthNodename);
	} 
	return itemIndex;
}

function treeview_ondrop()
{
	// Source Window, Tree...
	var srcWinObj = opener.children.item(model.property("_startDragWindowID"));
	var srcTreeObj = srcWinObj.document.all(model.property("_startDragTreeID"));
	
	var srcIndex = srcTreeObj.selectedIndex;
	var srcValue = srcTreeObj.item(srcIndex).value;

	var srcTreeItemNodeSet = srcTreeObj.itemset.attribute("nodeset");
	var srcTreeItemDepthNodename = srcTreeObj.itemset.depth.attribute("ref");
	var srcTreeItemValueNodename = srcTreeObj.itemset.value.attribute("ref");

	var srcLastChildItemIndex = getLastChildItemIndex(srcIndex, srcTreeItemNodeSet, srcTreeItemDepthNodename, srcWinObj);
	var srcNodeList = srcWinObj.instance1.selectNodes(srcTreeItemNodeSet + "[position() >= " + (srcIndex + 1)+ " and position() <=" + (srcLastChildItemIndex + 1) + "]");
	
	// Target Window, Tree...
	var trgTreeObj = document.all(event.currentTarget); 
	
	var trgIndex = trgTreeObj.mouseRow;
	var trgValue = trgTreeObj.item(trgIndex).value;

	var trgTreeItemNodeSet = trgTreeObj.itemset.attribute("nodeset");
	var trgTreeItemDepthNodename = trgTreeObj.itemset.depth.attribute("ref");
	var trgTreeItemValueNodename = trgTreeObj.itemset.value.attribute("ref");
	
	moveItem(trgIndex, trgTreeItemNodeSet, trgTreeItemDepthNodename, trgTreeItemValueNodename, srcNodeList);
	trgTreeObj.rebuild();
}

function moveItem (trgIndex, trgTreeItemNodeSet, trgTreeItemDepthNodename, trgTreeItemValueNodename, srcNodeList)
{	
	
	var lastChildIndex = getLastChildItemIndex(trgIndex, trgTreeItemNodeSet, trgTreeItemDepthNodename);
	var pTargetNode = instance1.selectSingleNode( trgTreeItemNodeSet.substr(0,trgTreeItemNodeSet.lastIndexOf("/")) );	
		
	var srcNode = null;
	var cSrcNode = null;
	
	var targetNodeList

	while( srcNode = srcNodeList.nextNode() ) 
	{
		cSrcNode = srcNode.cloneNode(true);
		targetNodeList = instance1.selectNodes( trgTreeItemNodeSet )
		pTargetNode.insertAfter(cSrcNode, targetNodeList.item(lastChildIndex));
		lastChildIndex++;
	}
}

// value 바꿔주는거 모 기타 등등 더 해야됨~ ㅡㅡ^

//변경된 위치의 depth의 값으로 depth 변경
function setDepthValue(srcIndex, trgIndex, treeItemNodeSet, treeItemDepthNodename, treeItemValueNodename)
{	
	var srcParentDepth = model.getValue(treeItemNodeSet + "[" + (srcIndex+1) + "]/"+treeItemDepthNodename);
	var targetDepth = model.getValue(treeItemNodeSet + "[" + (trgIndex + 1) + "]/"+treeItemDepthNodename);

	var depth = parseInt(targetDepth)+1;	
	var DepthCnt = depth - srcParentDepth;

	var lastChildIndex = getLastChildItemIndex(srcIndex, treeItemNodeSet, treeItemDepthNodename);	
	var childCount = lastChildIndex - srcIndex + 1;
		
	for(i=0; i<childCount; i++)
	{
			var childDepth = parseInt(model.getValue(treeItemNodeSet + "[" + (srcIndex+1) + "]/"+treeItemDepthNodename));
			model.setValue(treeItemNodeSet + "[" + (srcIndex + 1) + "]/"+treeItemDepthNodename, childDepth+DepthCnt);
			srcIndex++;
	}
}

//트리 노드셋 추출 
//ex) /root/data/tree/item  => root.data.tree
function convertStr( treeItemNodeSet )
{
	var nodeName = "";
	var nodeArray = treeItemNodeSet.split("/");	
	for ( i=1; i<nodeArray.length-1; i++)
	{
		nodeName = nodeName + "." + nodeArray[i];
	}

	return nodeName.substr(1,nodeName.length);
}