// Title: Design HashMap
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/design-hashmap/

                return curr.next.value;
            }
            curr=curr.next;
        }
        
        return -1;

    }
    public void remove(int key) { 

        int hash=hash(key);
        Node curr=buckets[hash];
        while(curr.next!=null){
            if(curr.next.key==key){
                
                curr.next=curr.next.next;
            }
            curr=curr.next;
        }

     }
                return;
}
