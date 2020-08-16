
class VotingMachine:
  

  
    def init(self,electionDistrict):
        self.electionDistrict=electionDistrict
        self.candidate={}
    #initializing the electionDistrict and candidate as an empty dictionary

    def castVote(self,cand):
        self.cand=cand
    if self.cand not in self.candidate: #checks for current castVote cand with the dictionary
        dict1 = {self.cand:1} #a new dictionary dict1 is used to store as a new candidate entry
        (self.candidate).update(dict1) #updates the new candidate to original dictionary
    else:
        num = int(self.candidate.get(self.cand)) #if candidate already in candidate dictionary, increment by 1
        num += 1
        self.candidate._setitem_(self.cand,num)
    def getVoteCount(self):
        print("District: ", self.electionDistrict)
    for name, vote in self.candidate.items(): #print the candidates along with there corresponding votes
        print(name, "received :", vote)
       # [@Freshersinfo]
    p1= VotingMachine("District 1") #initializing the class

    p1.castVote("alex") #cast the vote
    p1.castVote("alex")
    p1.castVote("lucy")
    p1.castVote("alex")
    p1.castVote("lucy")
    p1.castVote("alex")
    p1.castVote("lucy")

    p1.getVoteCount() #print the vote count