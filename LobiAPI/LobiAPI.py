# -*- coding: utf-8 -*-
import json,requests,sys,datetime,codecs
from pprint import pprint #Debugの為

class LobiAPI(object):
    LANG = "ja"
    PLATFORM = "android"
    TOKEN = None
    VERSION = "10.1.0"
    UA = "Nakamap 10.1.0 Android 8.0 Google Pixel C NRD90M"
    
    def cp65001(name):
        if name.lower() == 'cp65001':
            return codecs.lookup('utf-8')
    codecs.register(cp65001)

    def tokenlogin(self,token=""):
        result = requests.get("https://api.lobi.co/1/me?token="+token)
        if result.text == "Unauthorized, Token Invalid":
            return False
        else:
            self.TOKEN = token
            return True

    def printloginresult(self):
        me = self.GetMe()
        print ''
        print u'名前：'+me['name']
        print u'uid：'+me['uid']
        print 'token：' + self.TOKEN
        print ''

    def GetAccusationCategories(self):
        result = requests.get("https://api.lobi.co/1/accusation_categories?token="+self.TOKEN)
        return result.json()

    def GetActivities(self,count,last_cursor):
        result = requests.get("https://api.lobi.co/2/info/activity?token="+self.TOKEN)
        return result.json()

    def GetAdBannerPickup(self):
        result = requests.get("https://api.lobi.co/2/ad/banner/pickup?token="+self.TOKEN)
        return result.json()

    def GetAdInline(self,menu_types,version):
        result = requests.get("https://api.lobi.co/1/ad/inline?token="+self.TOKEN)
        return result.json()

    def GetAdReservations(self):
        result = requests.get("https://api.lobi.co/1/ad/reservations?token="+self.TOKEN)
        return result.json()

    def GetAnnouncements(self,count,last_cursor):
        result = requests.get("https://api.lobi.co/2/info/announce?token="+self.TOKEN)
        return result.json()

    def GetApp(self,client_id,more_fields,uid):
        result = requests.get("https://api.lobi.co/1/app/%s?token="+self.TOKEN)
        return result.json()
    
    def GetAppCommunityInfo(self,app_uid):
        result = requests.get("https://api.lobi.co/1/app/%s/community_info?token="+self.TOKEN)
        return result.json()
    
    def GetBanners(self,positions):
        result = requests.get("https://api.lobi.co/1/banners?token="+self.TOKEN)
        return result.json()
    
    def GetGame(self):
        result = requests.get("https://api.lobi.co/2/info/activity?token="+self.TOKEN)
        return result.json()
    
    def GetGameComment(self,target_user,uid):
        result = requests.get("https://api.lobi.co/1/game/%s/comment?token="+self.TOKEN)
        return result.json()
    
    def GetGameComments(self,count,cursor,uid):
        result = requests.get("https://api.lobi.co/1/game/%s/comments?token="+self.TOKEN)
        return result.json()
    
    def GetGameGenres(self):
        result = requests.get("https://api.lobi.co/1/game_genres?token="+self.TOKEN)
        return result.json()
    
    def GetGameGroups(self,count,order_by,page,uid):
        result = requests.get("https://api.lobi.co/1/game/%s/groups?token="+self.TOKEN)
        return result.json()
    
    def GetGameRecommends(self):
        result = requests.get("https://api.lobi.co/1/game_recommends?token="+self.TOKEN)
        return result.json()
    
    def GetGameStatus(self,game_uid,user_uid):#sort:hottest or newest
        result = requests.get("https://api.lobi.co/1/game/%s/game_status?token="+self.TOKEN)
        return result.json()
    
    def GetGames(self,count,genres,page,sort):
        result = requests.get("https://api.lobi.co/1/games?token="+self.TOKEN)
        return result.json()
    
    def GetGamesSearch(self):
        result = requests.get("https://api.lobi.co/1/games/search?token="+self.TOKEN)
        return result.json()
    
    def GetGroup(self):
        result = requests.get("https://api.lobi.co/1/group/%s?token="+self.TOKEN)
        return result.json()
    
    def GetGroupBookmarks(self):
        result = requests.get("https://api.lobi.co/1/group/%s/bookmarks?token="+self.TOKEN)
        return result.json()
    
    def GetGroupChatEditable(self):
        result = requests.get("https://api.lobi.co/1/group/%s/chats/editable?token="+self.TOKEN)
        return result.json()
    
    def GetGroupChatPokes(self):
        result = requests.get("https://api.lobi.co/1/group/%s/chats/pokes?token="+self.TOKEN)
        return result.json()
    
    def GetGroupChatReplies(self):
        result = requests.get("https://api.lobi.co/1/group/%s/chats/replies?token="+self.TOKEN)
        return result.json()
    
    def GetGroupChatV2(self):
        result = requests.get("https://api.lobi.co/2/group/%s/chats?token="+self.TOKEN)
        return result.json()
    
    def GetGroupChatsSearch(self,count,sort,q):
        result = requests.get("https://api.lobi.co/1/group/%s/chats/search?token="+self.TOKEN)
        return result.json()
    
    def GetGroupMemberChats(self):
        result = requests.get("https://api.lobi.co/1/group/%s/member/%s/chats?token="+self.TOKEN)
        return result.json()
    
    def GetGroupMembers(self):
        result = requests.get("https://api.lobi.co/1/group/%s/members?token="+self.TOKEN)
        return result.json()
    
    def GetGroupV2(self):
        result = requests.get("https://api.lobi.co/2/group/%s?token="+self.TOKEN)
        return result.json()
    
    def GetGroups(self):
        result = requests.get("https://api.lobi.co//1/groups?token="+self.TOKEN)
        return result.json()
    
    def GetGroupsBoundGames(self):
        result = requests.get("https://api.lobi.co/1/groups/bound_games?token="+self.TOKEN)
        return result.json()
    
    def GetGroupsInvited(self):
        result = requests.get("https://api.lobi.co//1/groups/invited?token="+self.TOKEN)
        return result.json()
    
    def GetGroupsV2(self):
        result = requests.get("https://api.lobi.co/2/groups?token="+self.TOKEN)
        return result.json()
    
    def GetGroupsV3(self):
        result = requests.get("https://api.lobi.co/3/groups?token="+self.TOKEN)
        return result.json()
    
    def GetMe(self):
        result = requests.get("https://api.lobi.co//1/me?token="+self.TOKEN)
        return result.json()
    
    def GetMeActivities(self):
        result = requests.get("https://api.lobi.co/2/me/activity?token="+self.TOKEN)
        return result.json()
    
    def GetMeAuths(self):
        result = requests.get("https://api.lobi.co/1/me/auths?token="+self.TOKEN)
        return result.json()
    
    def GetMeBlockingUsers(self):
        result = requests.get("https://api.lobi.co/1/me/blocking_users?token="+self.TOKEN)
        return result.json()
    
    def GetMeBlockingUsersWithPaging(self):
        result = requests.get("https://api.lobi.co/2/me/blocking_users?token="+self.TOKEN)
        return result.json()
    
    def GetMeBookmarks(self):
        result = requests.get("https://api.lobi.co/1/me/bookmarks?token="+self.TOKEN)
        return result.json()
    
    def GetMeBookmarksGroups(self):
        result = requests.get("https://api.lobi.co/1/me/bookmarks/groups?token="+self.TOKEN)
        return result.json()
    
    def GetMeContacts(self):
        result = requests.get("https://api.lobi.co/3/me/contacts?token="+self.TOKEN)
        return result.json()
    
    def GetMeContactsRecommended(self):
        result = requests.get("https://api.lobi.co/1/me/contacts/recommended?token="+self.TOKEN)
        return result.json()
    
    def GetMeFollowers(self):
        result = requests.get("https://api.lobi.co/2/me/followers?token="+self.TOKEN)
        return result.json()
    
    def GetMeGameBookmarks(self):
        result = requests.get("https://api.lobi.co/1/me/game/bookmarks?token="+self.TOKEN)
        return result.json()
    
    def GetMeGameList(self):
        result = requests.get("https://api.lobi.co/1/me/gamelist?token="+self.TOKEN)
        return result.json()
    
    def GetMeGameStatus(self):
        result = requests.get("https://api.lobi.co/1/me/game/%s/status?token="+self.TOKEN)
        return result.json()
    
    def GetMeGameStatuses(self):
        result = requests.get("https://api.lobi.co/1/me/game_statuses?token="+self.TOKEN)
        return result.json()
    
    def GetMeProfileVisibleGroups(self):
        result = requests.get("https://api.lobi.co/1/me/profile/visible_groups?token="+self.TOKEN)
        return result.json()
    
    def GetMeSettings(self):
        result = requests.get("https://api.lobi.co/1/me/settings?token="+self.TOKEN)
        return result.json()
    
    def GetMeSettingsNotifications(self):
        result = requests.get("https://api.lobi.co/2/me/settings/notifications?token="+self.TOKEN)
        return result.json()
    
    def GetMeSettingsV2(self):
        result = requests.get("https://api.lobi.co/2/me/settings?token="+self.TOKEN)
        return result.json()
    
    def GetMeUsers(self):
        result = requests.get("https://api.lobi.co/2/me/users?token="+self.TOKEN)
        return result.json()
    
    def GetMyGroupsChatsSearch(self):
        result = requests.get("https://api.lobi.co/1/groups/chats/search?token="+self.TOKEN)
        return result.json()
    
    def GetNotifications(self):
        result = requests.get("https://api.lobi.co/2/info/notifications?token="+self.TOKEN)
        return result.json()
    
    def GetPlaylistItems(self):
        result = requests.get("https://api.lobi.co/1/playlist/%s/items?token="+self.TOKEN)
        return result.json()
    
    def GetPublicCategories(self):
        result = requests.get("https://api.lobi.co/1/public_categories?token="+self.TOKEN)
        return result.json()
    
    def GetPublicCategoriesPickup(self):
        result = requests.get("https://api.lobi.co/1/public_categories/pickup?token="+self.TOKEN)
        return result.json()
    
    def GetPublicGroups(self):
        result = requests.get("https://api.lobi.co/1/public_groups?token="+self.TOKEN)
        return result.json()
    
    def GetPublicGroupsChatsSearch(self):
        result = requests.get("https://api.lobi.co/1/public_groups/chats/search?token="+self.TOKEN)
        return result.json()
    
    def GetPublicGroupsSearch(self):
        result = requests.get("https://api.lobi.co/1/public_groups/search?token="+self.TOKEN)
        return result.json()
    
    def GetPublicGroupsSpike(self):
        result = requests.get("https://api.lobi.co/2/public_groups/spike?token="+self.TOKEN)
        return result.json()
    
    def GetPublicGroupsTreeV2(self):
        result = requests.get("https://api.lobi.co/2/public_groups/tree?token="+self.TOKEN)
        return result.json()
    
    def GetPublicGroupsTreeV3(self):
        result = requests.get("https://api.lobi.co/3/public_groups/tree?token="+self.TOKEN)
        return result.json()
    
    def GetRegion(self):
        result = requests.get("https://api.lobi.co/1/regions?token="+self.TOKEN)
        return result.json()
    
    def GetRewardStamp(self):
        result = requests.get("https://api.lobi.co/1/reward/stamp?token="+self.TOKEN)
        return result.json()
    
    def GetStamps(self):
        result = requests.get("https://api.lobi.co/1/stamps?token="+self.TOKEN)
        return result.json()
    
    def GetStartup(self):
        result = requests.get("https://api.lobi.co/2/startup?token="+self.TOKEN)
        return result.json()
    
    def GetStore(self):
        result = requests.get("https://api.lobi.co/1/store?token="+self.TOKEN)
        return result.json()
    
    def GetStoreStampDetail(self,id,lang):
        result = requests.get("https://api.lobi.co/1/store/stamp/%s?token="+self.TOKEN)
        return result.json()
    
    def GetStoreSubscriptionList(self):
        result = requests.get("https://api.lobi.co/1/store/subscription/list?token="+self.TOKEN)
        return result.json()
    
    def GetTickets(self):
        result = requests.get("https://api.lobi.co/2/tickets?token="+self.TOKEN)
        return result.json()
    
    def GetTopic(self,uid):
        result = requests.get("https://api.lobi.co/1/topic/%s/?token="+self.TOKEN)
        return result.json()
    
    def GetTopicV2(self,uid):
        result = requests.get("https://api.lobi.co/2/topic/%s/?token="+self.TOKEN)
        return result.json()
    
    def GetTopics(self):
        result = requests.get("https://api.lobi.co/1/topics?token="+self.TOKEN)
        return result.json()
    
    def GetTutorialGroups(self):
        result = requests.get("https://api.lobi.co/1/tutorial/groups?token="+self.TOKEN)
        return result.json()
    
    def GetUser(self,uid):
        result = requests.get("https://api.lobi.co/1/user/"+uid+"?token="+self.TOKEN)
        return result.json()
    
    def GetUserActivities(self,uid):
        result = requests.get("https://api.lobi.co/2/user/"+uid+"/activity?token="+self.TOKEN)
        return result.json()
    
    def GetUserAppusers(self,uid):
        result = requests.get("https://api.lobi.co/1/user/"+uid+"/app_users?token="+self.TOKEN)
        return result.json()
    
    def GetUserContacts(self,uid):
        result = requests.get("https://api.lobi.co/2/user/"+uid+"/contacts?token="+self.TOKEN)
        return result.json()
    
    def GetUserDefaultUser(self,user_uid):
        result = requests.get("https://api.lobi.co/1/user/"+user_uid+"/default_user?token="+self.TOKEN)
        return result.json()
